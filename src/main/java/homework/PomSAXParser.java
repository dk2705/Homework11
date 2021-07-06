package homework;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class PomSAXParser extends DefaultHandler {
    
    private List<Properties> propertiesList = new ArrayList<>();
    private List<Manifest> manifestList = new ArrayList<>();
    private List<Goals> goalsList = new ArrayList<>();
    private List<DescriptorRefs> descriptorRefsList = new ArrayList<>();
    private List<Execution> executionList = new ArrayList<>();
    private List<Executions> executionsList = new ArrayList<>();
    private List<Archive> archiveList = new ArrayList<>();
    private List<Configuration> configurationList = new ArrayList<>();
    private List<Plugin> pluginList = new ArrayList<>();
    private List<Plugins> pluginsList = new ArrayList<>();
    private List<Build> buildList = new ArrayList<>();
    private Properties properties;
    private Manifest manifest;
    private Goals goals;
    private DescriptorRefs descriptorRefs;
    private Execution execution;
    private Executions executions;
    private Archive archive;
    private Configuration configuration;
    private Plugin plugin;
    private Plugins plugins;
    private Build build;
    private Project project;
    private final static String PROPERTIES = "properties";
    private final static String PROJECT_BUILD_SOURCEENCODING = "project.build.sourceEncoding";
    private final static String MAVEN_COMPILER_SOURCE = "maven.compiler.source";
    private final static String MAVEN_COMPILER_TARGET = "maven.compiler.target";
    private final static String MANIFEST = "manifest";
    private final static String MAINCLASS = "mainClass";
    private final static String GOALS = "goals";
    private final static String GOAL = "goal";
    private final static String DESCRIPTORREFS = "descriptorRefs";
    private final static String DESCRIPTORREF = "descriptorRef";
    private final static String EXECUTION = "execution";
    private final static String ID = "id";
    private final static String PHASE = "phase";
    private final static String EXECUTIONS = "executions";
    private final static String ARCHIVE = "archive";
    private final static String CONFIGURATION = "configuration";
    private final static String PLUGIN = "plugin";
    private final static String ARTIFACTID = "artifactId";
    private final static String VERSION = "version";
    private final static String PLUGINS = "plugins";
    private final static String BUILD = "build";
    private final static String PROJECT = "project";
    private final static String MODELVERSION = "modelVersion";
    private final static String GROUPID = "groupId";
    private final static String PACKAGING = "packaging";
    private String currentNode = "";
    private String prevNode = "";
    
    @Override
    public void startDocument(){
        System.out.println("Start Document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        prevNode = currentNode;
        currentNode = qName;
        switch(currentNode){
            case PROPERTIES:
                properties = new Properties();
                break;
            case MANIFEST:
                manifest = new Manifest();
                break;
            case GOALS:
                goals = new Goals();
                break;
            case DESCRIPTORREFS:
                descriptorRefs = new DescriptorRefs();
                break;
            case EXECUTION:
                execution = new Execution();
                break;
            case EXECUTIONS:
                executions = new Executions();
                break;
            case ARCHIVE:
                archive = new Archive();
                break;
            case CONFIGURATION:
                configuration = new Configuration();
                break;
            case PLUGIN:
                plugin = new Plugin();
                break;
            case PLUGINS:
                plugins = new Plugins();
                break;
            case BUILD:
                build = new Build();
                break;
            case PROJECT:
                project = new Project();
                project.setXmlns(attributes.getValue(0));
                project.setXmlnsXsi(attributes.getValue(1));
                project.setXsiSchemaLocation(attributes.getValue(2));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName){
        switch(qName){
            case PROPERTIES:
                propertiesList.add(properties);
                break;
            case MANIFEST:
                manifestList.add(manifest);
                break;
            case GOALS:
                goalsList.add(goals);
                break;
            case DESCRIPTORREFS:
                descriptorRefsList.add(descriptorRefs);
                break;
            case EXECUTION:
                execution.setGoals(goals);
                executionList.add(execution);
                break;
            case EXECUTIONS:
                executions.setExecution(execution);
                executionsList.add(executions);
                break;
            case ARCHIVE:
                archive.setManifest(manifest);
                archiveList.add(archive);
                break;
            case CONFIGURATION:
                configuration.setDescriptorRefs(descriptorRefs);
                configuration.setArchive(archive);
                configurationList.add(configuration);
                break;
            case PLUGIN:
                plugin.setConfiguration(configuration);
                plugin.setExecutions(executions);
                pluginList.add(plugin);
                break;
            case PLUGINS:
                plugins.setPlugin(plugin);
                pluginsList.add(plugins);
                break;
            case BUILD:
                build.setPlugins(plugins);
                buildList.add(build);
                break;
            case PROJECT:
                project.setProperties(properties);
                project.setBuild(build);
                break;
        }
        currentNode = prevNode; //делаем текущим родительский тэг, чтобы он взялся как предыдущий для любого дочернего, а не только для 1-го
    }

    @Override
    public void characters(char[] ch, int start, int length){
        String str = "";
        for(int i=start; i<start+length; i++){
            str += ch[i];
        }
        str = str.trim();
        switch(currentNode){
            case PROJECT_BUILD_SOURCEENCODING:
                if(!("".equals(str))){
                    properties.setProjectBuildSourceEncodingListElement(str);
                }
                break;
            case MAVEN_COMPILER_SOURCE:
                if(!("".equals(str))){
                    properties.setMavenCompilerSourceListElement(str);
                }
                break;
            case MAVEN_COMPILER_TARGET:
                if(!("".equals(str))){
                    properties.setMavenCompilerTargetListElement(str);
                }
                break;
            case MAINCLASS:
                if(!("".equals(str))){
                    manifest.setMainClass(str);
                }
                break;
            case GOAL:
                if(!("".equals(str))){
                    goals.setGoal(str);
                }
                break;
            case DESCRIPTORREF:
                if(!("".equals(str))){
                    descriptorRefs.setDescriptorRef(str);
                }
                break;
            case ID:
                if(!("".equals(str))){
                    execution.setId(str);
                }
                break;
            case PHASE:
                if(!("".equals(str))){
                    execution.setPhase(str);
                }
                break;
            case ARTIFACTID:
                if(!("".equals(str))){
                    if("plugin".equals(prevNode)){
                        plugin.setArtifactId(str);
                    }
                    if("project".equals(prevNode)){
                        project.setArtifactId(str);
                    }
                }
                break;
            case VERSION:
                if(!("".equals(str))){
                    if("plugin".equals(prevNode)){
                        plugin.setVersion(str);
                    }
                    if("project".equals(prevNode)){
                        project.setVersion(str);
                    }
                }
                break;
            case MODELVERSION:
                if(!("".equals(str))){
                    project.setModelVersion(str);
                }
                break;
            case GROUPID:
                if(!("".equals(str))){
                    if("project".equals(prevNode)){
                        project.setGroupId(str);
                    }
                }
                break;
            case PACKAGING:
                if(!("".equals(str))){
                    project.setPackaging(str);
                }
                break;
        }
    }
    
    @Override
    public void endDocument(){
        System.out.println("End Document");
        //System.out.println("List: " + propertiesList);
        //System.out.println("List: " + manifestList);
        //System.out.println("List: " + goalsList);
        //System.out.println("List: " + descriptorRefsList);
        //System.out.println("List: " + executionList);
        //System.out.println("List: " + executionsList);
        //System.out.println("List: " + archiveList);
        //System.out.println("List: " + configurationList);
        //System.out.println("List: " + pluginList);
        //System.out.println("List: " + pluginsList);
        //System.out.println("List: " + buildList);
        System.out.println(project);
    }
    
}
