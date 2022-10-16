package ru.netology

fun main() {
    val postOne = Post(1,165002,165003,777,1650508085,"One",77,88,true,
    comments(12,true,true,true,true), copyright(12,"","New name", "type"),
    likes(100,true,true,true), repost(15,true), views(200), "post",
    geo("Cont", "55.55 49.49"),101,true, false,false,true,true,
    true, donut(false,1662000, "No dount", true,"All"),
    false
    )
    val postTwo = Post(1,165002,165003,777,1650508085,null,77,88,true,
        comments(12,true,true,true,true),copyright(12,"","New name", "type"),
        likes(100,true,true,true), repost(15,true),views(200), "post",
        geo("Cont", "55.55 49.49"),101,true, false,false,true,true,
        true, donut(false,1662000, "No dount", true,"All"),
        false)

    WallService.add(postOne)
    WallService.add(postTwo)
    println(WallService.posts.size)

}

data class Post(
    val id: Int = 1,
    val ownerId: Int = 165002,
    val fromId: Int = 165003,
    val createdBy: Int = 777,
    val date: Long = System.currentTimeMillis() / 1000,
    val text: String?,
    val replyOwner_id: Int = 77,
    val replyPost_id: Int = 88,
    val friendsOnly: Boolean = true,
    val comments: comments,
    val copyright: copyright,
    val likes: likes,
    val repost: repost,
    val views: views,
    val postType: String = "post",
    val geo: geo,
    val singerId: Int = 101,
    val canPin: Boolean = true,
    val canDelete: Boolean = false,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: donut,
    val postponedId: Boolean = false

)

object WallService {

    var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        if (post.text !== null)
        posts += post
        return posts.last()
    }
}

class comments(
    val count: Int = 12,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)

class copyright(
    val id: Int = 12,
    val  link: String = "",
    val name: String = "New name",
    val type: String = "type"
)
class likes(
    val count: Int = 100,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPuplish: Boolean = true

)
class repost(
    val count: Int = 15,
    val userReposted: Boolean = true
)
class views(
    val count: Int = 200
)
class geo(
    val type: String = "Continent",
    val coordinates: String = "55.966943 49.211736",
)
class donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 1662000,
    val placeholder: String = "No dount",
    val canPublishFreeCopy: Boolean = true,
    val editMode: String = "All"
)