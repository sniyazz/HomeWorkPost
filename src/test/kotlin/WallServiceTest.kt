import org.junit.Test

import org.junit.Assert.*
import ru.netology.*

class WallServiceTest {

    @Test
    fun add() {

        WallService.add(
            Post(1,165002,165003,777,1650508085,"One",77,88,true,
                comments(12,true,true,true,true), copyright(12,"","New name", "type"),
                likes(100,true,true,true), repost(15,true), views(200), "post",
                geo("Cont", "55.55 49.49"),101,true, false,false,true,true,
                true, donut(false,1662000, "No dount", true,"All"),
                false
    )
        )
        WallService.add(
            Post(1,165002,165003,777,1650508085,null,77,88,true,
                comments(12,true,true,true,true), copyright(12,"","New name", "type"),
                likes(100,true,true,true), repost(15,true), views(200), "post",
                geo("Cont", "55.55 49.49"),101,true, false,false,true,true,
                true, donut(false,1662000, "No dount", true,"All"),
                false
            )
        )

        val result = WallService.posts.size

        assertEquals(1, result)
    }
}