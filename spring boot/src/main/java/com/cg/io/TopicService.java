package com.cg.io;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "spring Framework","spring Framework Description"),
			new Topic("java", "java core","core java description"),
			new Topic("java script", "java script","java script Description")
			
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		
		topics.add(topic);
		
		
	}

}
