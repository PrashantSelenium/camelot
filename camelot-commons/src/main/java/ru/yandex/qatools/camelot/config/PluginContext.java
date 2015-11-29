//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.17 at 04:57:23 PM MSK 
//


package ru.yandex.qatools.camelot.config;

import org.apache.camel.spi.AggregationRepository;
import ru.yandex.qatools.camelot.api.*;
import ru.yandex.qatools.camelot.common.InterimProcessor;
import ru.yandex.qatools.camelot.common.MessagesSerializer;
import ru.yandex.qatools.camelot.common.PluginContextInjector;
import ru.yandex.qatools.camelot.common.PluginsService;
import ru.yandex.qatools.camelot.common.builders.SchedulerBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginContext", propOrder = {
        "id",
        "isShuttingDown",
        "widgetPath",
        "dashboardPath",
        "jsPaths",
        "cssPaths",
        "resDirPath",
        "resPathMapping",
        "pluginClass",
        "frontendNotifyUri",
})
public class PluginContext
        implements Serializable {

    protected String id;
    protected String widgetPath;
    protected String dashboardPath;
    @XmlElement(name = "jsPath")
    protected List<String> jsPaths;
    @XmlElement(name = "cssPath")
    protected List<String> cssPaths;
    protected String resDirPath;
    protected String resPathMapping;
    protected String frontendNotifyUri;
    protected volatile boolean isShuttingDown = false;
    protected transient AggregatorRepository repository;
    protected transient Storage storage;
    protected transient EventProducer input;
    protected transient EventProducer output;
    protected transient EventProducer mainInput;
    protected transient ClassLoader classLoader;
    protected transient ClientSendersProvider clientSendersProvider;
    protected transient PluginEndpoints endpoints;
    @XmlElement(required = true)
    protected String pluginClass;
    protected transient PluginsInterop interop;
    protected transient PluginsSource source;
    protected transient PluginContextInjector injector;
    protected transient AggregationRepository aggregationRepo;
    protected transient AppConfig appConfig;
    protected transient SchedulerBuilder schedulerBuilder;
    protected transient MessagesSerializer messagesSerializer;
    protected transient InterimProcessor interimProcessor;
    protected transient PluginsService pluginsService;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the widgetPath property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWidgetPath() {
        return widgetPath;
    }

    /**
     * Sets the value of the widgetPath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidgetPath(String value) {
        this.widgetPath = value;
    }

    /**
     * Gets the value of the dashboardPath property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDashboardPath() {
        return dashboardPath;
    }

    /**
     * Sets the value of the dashboardPath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDashboardPath(String value) {
        this.dashboardPath = value;
    }

    /**
     * Gets the value of the jsPaths property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsPaths property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsPaths().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getJsPaths() {
        if (jsPaths == null) {
            jsPaths = new ArrayList<String>();
        }
        return this.jsPaths;
    }

    /**
     * Gets the value of the cssPaths property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsPaths property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCssPaths().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getCssPaths() {
        if (cssPaths == null) {
            cssPaths = new ArrayList<>();
        }
        return cssPaths;
    }

    /**
     * Gets the value of the resDirPath property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getResDirPath() {
        return resDirPath;
    }

    /**
     * Sets the value of the resDirPath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResDirPath(String value) {
        this.resDirPath = value;
    }

    /**
     * Gets the value of the resPathMapping property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getResPathMapping() {
        return resPathMapping;
    }

    /**
     * Sets the value of the resPathMapping property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResPathMapping(String value) {
        this.resPathMapping = value;
    }

    /**
     * Gets the value of the repository property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public AggregatorRepository getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setRepository(AggregatorRepository value) {
        this.repository = value;
    }

    /**
     * Gets the value of the storage property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setStorage(Storage value) {
        this.storage = value;
    }

    /**
     * Gets the value of the input property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public EventProducer getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setInput(EventProducer value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public EventProducer getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setOutput(EventProducer value) {
        this.output = value;
    }

    /**
     * Gets the value of the mainInput property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public EventProducer getMainInput() {
        return mainInput;
    }

    /**
     * Sets the value of the mainInput property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setMainInput(EventProducer value) {
        this.mainInput = value;
    }

    /**
     * Gets the value of the classLoader property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public ClassLoader getClassLoader() {
        return classLoader;
    }

    /**
     * Sets the value of the classLoader property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setClassLoader(ClassLoader value) {
        this.classLoader = value;
    }

    /**
     * Gets the value of the clientSendersProvider property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public ClientSendersProvider getClientSendersProvider() {
        return clientSendersProvider;
    }

    /**
     * Sets the value of the clientSendersProvider property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setClientSendersProvider(ClientSendersProvider value) {
        this.clientSendersProvider = value;
    }

    /**
     * Gets the value of the endpoints property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public PluginEndpoints getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setEndpoints(PluginEndpoints value) {
        this.endpoints = value;
    }

    /**
     * Gets the value of the pluginClass property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPluginClass() {
        return pluginClass;
    }

    /**
     * Sets the value of the pluginClass property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPluginClass(String value) {
        this.pluginClass = value;
    }

    /**
     * Gets the value of the interop property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public PluginsInterop getInterop() {
        return interop;
    }

    /**
     * Sets the value of the interop property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setInterop(PluginsInterop value) {
        this.interop = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return possible object is
     *         {@link ru.yandex.qatools.camelot.config.PluginsSource }
     */
    public PluginsSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value allowed object is
     *              {@link ru.yandex.qatools.camelot.config.PluginsSource }
     */
    public void setSource(PluginsSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the injector property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public PluginContextInjector getInjector() {
        return injector;
    }

    /**
     * Sets the value of the injector property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setInjector(PluginContextInjector value) {
        this.injector = value;
    }

    /**
     * Gets the value of the aggregationRepo property.
     *
     * @return possible object is
     *         {@link Object }
     */
    public AggregationRepository getAggregationRepo() {
        return aggregationRepo;
    }

    /**
     * Sets the value of the aggregationRepo property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setAggregationRepo(AggregationRepository value) {
        this.aggregationRepo = value;
    }


    public AppConfig getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public SchedulerBuilder getSchedulerBuilder() {
        return schedulerBuilder;
    }

    public void setSchedulerBuilder(SchedulerBuilder schedulerBuilder) {
        this.schedulerBuilder = schedulerBuilder;
    }

    public boolean isShuttingDown() {
        return isShuttingDown;
    }

    public void setShuttingDown(boolean shuttingDown) {
        isShuttingDown = shuttingDown;
    }

    public String getFrontendNotifyUri() {
        return frontendNotifyUri;
    }

    public void setFrontendNotifyUri(String frontendNotifyUri) {
        this.frontendNotifyUri = frontendNotifyUri;
    }

    public MessagesSerializer getMessagesSerializer() {
        return messagesSerializer;
    }

    public void setMessagesSerializer(MessagesSerializer messagesSerializer) {
        this.messagesSerializer = messagesSerializer;
    }

    public InterimProcessor getInterimProcessor() {
        return interimProcessor;
    }

    public void setInterimProcessor(InterimProcessor interimProcessor) {
        this.interimProcessor = interimProcessor;
    }

    public PluginsService getPluginsService() {
        return pluginsService;
    }

    public void setPluginsService(PluginsService pluginsService) {
        this.pluginsService = pluginsService;
    }
}
