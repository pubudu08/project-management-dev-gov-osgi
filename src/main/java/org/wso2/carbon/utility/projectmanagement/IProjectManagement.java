package org.wso2.carbon.utility.projectmanagement;

/**
 * IProjectManagement is an interface for all Project Management related APIs
 * this will act as a pluggable api interface.
 * @author Pubudu Dissanayake : pubudud@wso2.com  on 02/02/2014.
 *
 **/

public interface IProjectManagement {

    /**
     * This method will returns artifact type
     * @return <code>pms</code>
     **/
    public String getPMSType();

    /**
     * This method will create a project which is related to PM
     * @param pmHost the host name to create a project
     * @param apiKey API key
     * @param projectName  project name
     * @return  <code>true</code> if project created successfully
     */

    public boolean createPMSProject(String pmHost, String apiKey, String projectName);

    /**
     * check whether project is exists or not
     * @param pmHost   Host name of the API
     * @param apiKey   Basic API key
     * @param projectName  name of the project to search
     * @return  <code>true</code> if project already exists
     */
    public boolean isPMSProjectExist(String pmHost, String apiKey, String projectName);


}
