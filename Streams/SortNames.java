package com.pvt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortNames {

    private Map<Integer, StringBuilder> listPersons;

    public void setListOFPersons(Map<Integer, StringBuilder> listPersons) {
        this.listPersons = listPersons;
    }

    public List<StringBuilder> sortList() {
        return listPersons.entrySet().stream().filter(x -> (x.getKey() == 1) || (x.getKey() == 2) || (x.getKey() == 5)
                || (x.getKey() == 8) || (x.getKey() == 9) || (x.getKey() == 13)).map(Map.Entry::getValue).
                filter(y -> y.length() % 2 != 0).peek(StringBuilder::reverse).collect(Collectors.toList());
    }
}