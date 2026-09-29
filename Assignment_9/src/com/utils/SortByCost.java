package com.utils;

import java.util.Comparator;

import com.project.Project;

public class SortByCost implements Comparator<Project> {

	@Override
	public int compare(Project x, Project y) {
		return Double.compare(x.getProjectCost(), y.getProjectCost());
	}

	
	
	
}
