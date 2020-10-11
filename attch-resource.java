public void useHardCodedResources(long userId) {
	final String URL = "https://10.20.30.90/api/user/";
	User user = restTemplate.getObject(URL + userId, User.class);
	...
}

public void useAttachedResources(String resourceConfig, long userId) {
	User user = restTemplate.getObject(resourceConfig + userId, User.class);
	...
}