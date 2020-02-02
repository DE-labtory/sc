package com.delabtory.sc.userupgradepolicy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static com.delabtory.sc.userupgradepolicy.UserService.MIN_LOGCOUNT_FOR_SILVER;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveAndFindAndUpdate() {
        User user1 = new User(1L, "A", Level.SILVER,MIN_LOGCOUNT_FOR_SILVER-1, 0);
        this.userRepository.save(user1);

        User user1Find = this.userRepository.findById(user1.getId()).get();
        assertThat(user1).isEqualToComparingFieldByField(user1Find);

        user1 = new User(1L, "B", Level.SILVER, MIN_LOGCOUNT_FOR_SILVER-1, 0);
        this.userRepository.save(user1);

        User user1Update = this.userRepository.findById(1L).get();
        assertThat(user1).isEqualToComparingFieldByField(user1Update);
    }


}
