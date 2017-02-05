package com.pantherhackers.bootcamp.navigation;

import com.pantherhackers.bootcamp.util.InputListener;
import com.pantherhackers.bootcamp.util.OptionsBuilder;

public class NavigationBuilder {

    private final OptionsBuilder<Navigatable> builder;

    public NavigationBuilder(InputListener listener) {
        builder = new OptionsBuilder<>(listener);
    }

    public void addOption(String title, Navigatable view) {
        builder.addOption(title, view);
    }

    public void build(){
        builder.build(Navigatable::render);
    }
}
