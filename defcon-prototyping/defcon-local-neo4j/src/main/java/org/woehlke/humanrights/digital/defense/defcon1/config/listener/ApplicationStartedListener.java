package org.woehlke.humanrights.digital.defense.defcon1.config.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by tw on 23.06.18.
 */
@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        LOGGER.info("================================ ");
        LOGGER.info(" ");
        LOGGER.info("defcon1 Copyright (C) 2018  Thomas Woehlke");
        LOGGER.info("        This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.");
        LOGGER.info("        This is free software, and you are welcome to redistribute it");
        LOGGER.info("        under certain conditions; type `show c' for details.");
        LOGGER.info(" ");
        LOGGER.info(" ");
        LOGGER.info("================================ ");
        LOGGER.info("===== Application Started ====== ");
        LOGGER.info("================================ ");
        LOGGER.info(" ");
    }

    private static final Log LOGGER = LogFactory.getLog(ApplicationStartedListener.class);

}
