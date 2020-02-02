package com.delabtory.sc.userupgradepolicy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
public class UserTests {
    @Test
    public void nextLevels_WhenLevelIsBasic_ThenUpgradeToSilver() {
        User user = new User("A");
        assertThat(user.getLevel()).isEqualTo(Level.BASIC);

        user.upgradeLevel();
        assertThat(user.getLevel()).isEqualTo(Level.SILVER);
    }
}
