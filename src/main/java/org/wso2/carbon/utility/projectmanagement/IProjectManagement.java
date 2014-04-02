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
     * @param username username
     * @param password password
     * @param projectName  project name
     * @return  <code>true</code> if project created successfully
     */

    public boolean createPMSProject(String pmHost, String username,String password, String projectName);

    /**
     * check whether project is exists or not
     * @param pmHost   Host name of the API
     * @param username username
     * @param password password
     * @param projectName  name of the project to search
     * @return  <code>true</code> if project already exists
     */
    public boolean isPMSProjectExist(String pmHost, String username,String password, String projectName);


}
