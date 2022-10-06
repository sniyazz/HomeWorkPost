package ru.netology

fun main() {
    val post = Post(
        1, 1350002, 165003, 777, 166005, "TEXXt", "post", true,
        false, true, true, comments(12, true, false, true, true)
    )
}

data class Post(
    val id: Int = 1,
    val ownerId: Int = 165002,
    val fromId: Int = 165003,
    val createdBy: Int = 777,
    val date: Long = System.currentTimeMillis() / 1000,
    val text: String = "Hi, its my text",
    val postType: String = "post",
    val canPin: Boolean = true,
    val canDelete: Boolean = false,
    val canEdit: Boolean = true,
    val isFavorite: Boolean = true,
    val comments: comments
)

object WallService

var posts = emptyArray<Post>()
fun add(post: Post): Post {
    posts += post
    return posts.last()
}

class comments(
    val count: Int = 12,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)