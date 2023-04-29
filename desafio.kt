enum class Nivel { BASIC, INTERMEDIARY, HARD }

class User (val name: String, var age: Int) {
    
    override fun toString(): String {
        return "User:\n\tName: $name.\n\tAge: $age."
    }
}

data class Content(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Training(val nome: String, var conteudos: List<Content>) {

    val subscribed = mutableMapOf<Int,User>();
    
    fun subscribe(vararg user: User) {
        for (u in user) {
       		subscribed.put(subscribed.size + 1,u);
        }
    }
}

fun main() {
        
    val user1 = User("first user", 20);
    val user2 = User("second user", 23);
    val user3 = User("third user", 21);
    
    val content1 = Content("first course", 360, Nivel.HARD);
    val content2 = Content("second course", 180, Nivel.BASIC);
    val content3 = Content("third course", 420, Nivel.INTERMEDIARY);
    var contents = mutableListOf<Content>();
    contents.add(content1);
    contents.add(content2);
    contents.add(content3);
    
    var training = Training("first training",contents);
    training.subscribe(user1, user2, user3)
	println (training.subscribed);
    
    
//     println(users);
//     println(contents);
//     println(training);
    
}