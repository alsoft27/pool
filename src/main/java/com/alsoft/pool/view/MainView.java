package com.alsoft.pool.view;

import com.alsoft.pool.domain.Pool;
import com.alsoft.pool.service.PoolService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	private final PoolService poolService;

	private Grid<Pool> grid;;

	public MainView(PoolService poolService) {
		this.poolService = poolService;
		this.grid = new Grid<>(Pool.class);
		add(grid);
		grid.setHeight("300px");
		grid.setColumns("id", "name", "description");
		listPool();
	}

	private void listPool() {
		grid.setItems(poolService.findAll());
	}

}
