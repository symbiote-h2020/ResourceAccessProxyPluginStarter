package eu.h2020.symbiote.rapplugin.messaging.properties;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import eu.h2020.symbiote.rapplugin.properties.RapProperties;

@RunWith(SpringRunner.class)
@EnableConfigurationProperties(RapProperties.class)
@TestPropertySource(locations = "classpath:custom.properties")
public class RapPropertiesTests {
    @Autowired
    private RapProperties props;

    @Test
    public void shouldLoadFirstLevelProperties() {
        assertThat(props.isFiltersSupported()).isTrue();
        assertThat(props.isNotificationsSupported()).isTrue();
    }
}
