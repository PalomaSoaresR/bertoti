import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.Tweet;
import com.example.Twitter;
import com.example.User;

public class TwitterTest {

    @Test
    void testTwitter() {
        assertTrue(true);
        Twitter twitter = new Twitter();
        //adiciona os usuários 
        User user1 = new User("Bertoti");
        User user2 = new User("paloma");
        twitter.addUser(user1);
        twitter.addUser(user2);

        // verifica se os usuários foram adicionados
        assertEquals(2, twitter.getUsers().size());
        assertEquals("Bertoti", twitter.getUsers().get(0).getUserName());

        // busca de usuários
        List<User> encontrados = twitter.buscarUsers("Bertoti");
        assertEquals(1, encontrados.size());
        assertEquals("Bertoti", encontrados.get(0).getUserName());

        // cria um tweet
        Tweet tweet = twitter.criarTweet("hoje a aula de engenharia de software foi demais", "2024-05-17 10:00");
        assertNotNull(tweet.getConteudo());

        assertEquals(1, twitter.getTweets().size());
        assertEquals("hoje a aula de engenharia de software foi demais", twitter.getTweets().get(0).getConteudo());
        assertEquals("2024-05-17 10:00", twitter.getTweets().get(0).getDataHora());
    }
}
