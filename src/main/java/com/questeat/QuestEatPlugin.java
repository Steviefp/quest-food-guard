package com.questeat;


import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.gameval.ItemID;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@PluginDescriptor(
        name = "Quest Eat"
)
public class QuestEatPlugin extends Plugin {
    @Inject
    private Client client;


    // quest edible ID's
    // EVIL DAVE STEW NOT ADDED
    private static final Set<Integer> CONFIRM_ITEMS = Set.of(
            ItemID.TOMATO,
            ItemID.BANANA,
            ItemID.CHOCOLATE_BAR,
            ItemID.CHOCOLATY_MILK,
            ItemID.CHEESE,
            ItemID.ORANGE_SLICES,
            ItemID.HUNDRED_PIRATE_FISHCAKE,
            ItemID._100_JUBBLY_MEAT_COOKED,
            ItemID.HUNDRED_ILM_COOKED_STUFFED_SNAKE,
            ItemID.VILLAGE_RARE_TUBER

    );


    /*
    Look for inventory event
    check if its edible
    */
    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {
        // would like to only check inv

        System.out.println("TESTING: " + event.getMenuEntry().getParam0());

        MenuEntry[] entries = client.getMenuEntries();
        List<MenuEntry> newEntries = new ArrayList<>();

        for (MenuEntry entry : entries) {
            if (!(entry.getOption().equals("Eat") && CONFIRM_ITEMS.contains(entry.getItemId()))) {
                newEntries.add(entry);
            }
        }

        // Update menu entries with the filtered list
        client.setMenuEntries(newEntries.toArray(new MenuEntry[0]));
    }


    @Override
    protected void startUp() throws Exception {
        log.info("Example started!");
    }

    @Override
    protected void shutDown() throws Exception {
        log.info("Example stopped!");
    }


}
