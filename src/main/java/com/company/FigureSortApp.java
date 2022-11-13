package com.company;

import com.company.models.Figure;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FigureSortApp {

    public List<Figure> sortFigures(List<Figure> figures){
        return figures.stream()
                .sorted(Comparator.comparing(Figure::calculateArea))
                .collect(Collectors.toList());
    }
}
