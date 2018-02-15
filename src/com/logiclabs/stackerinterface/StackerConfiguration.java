package com.logiclabs.stackerinterface;

public class StackerConfiguration {
	private String schema = "https";
	private String host;
	private int port = 443;
	private String username;
	private String password;
	private String githubAccount;
	private String githubRepository;
	private String githubBranch;
	private String githubSourcePath;
	private String nodeId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getGithubAccount() {
		return githubAccount;
	}

	public void setGithubAccount(String githubAccount) {
		this.githubAccount = githubAccount;
	}

	public String getGithubRepository() {
		return githubRepository;
	}

	public void setGithubRepository(String githubRepository) {
		this.githubRepository = githubRepository;
	}

	public String getGithubSourcePath() {
		return githubSourcePath;
	}

	public void setGithubSourcePath(String githubSourcePath) {
		this.githubSourcePath = githubSourcePath;
	}

	public String getGithubBranch() {
		return githubBranch;
	}

	public void setGithubBranch(String githubBranch) {
		this.githubBranch = githubBranch;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}
}
