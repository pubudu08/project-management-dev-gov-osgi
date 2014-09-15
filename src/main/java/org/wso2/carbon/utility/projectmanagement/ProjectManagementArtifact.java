package org.wso2.carbon.utility.projectmanagement;

import org.wso2.carbon.utility.projectmanagement.exception.GenericArtifactException;

/**
 * ProjectManagementArtifact is an interface for all Project Management related APIs
 * this will act as a pluggable api interface.
 *
 * @author Pubudu Dissanayake : pubudud@wso2.com  on 02/02/2014.
 */

public interface ProjectManagementArtifact {

	/**
	 * This method will returns artifact type
	 *
	 * @return <code>pms</code>
	 */
	public String getPMSType();

	/**
	 * This method will create a project which is related to PM
	 *
	 * @param pmHost      the host name to create a project
	 * @param username    username
	 * @param password    password
	 * @param projectName project name
	 * @return <code>true</code> if project created successfully
	 */

	public void createPMSProject(String pmHost, String username, String password, String projectName) throws GenericArtifactException;

}
