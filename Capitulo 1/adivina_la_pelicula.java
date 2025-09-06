public class adivina_la_pelicula {
    String pelicula(String emoji1, String emoji2, String emoji3){
        return String.format("La pelicula es:[%s, %s, %s] ", emoji1, emoji2, emoji3);
    }
        public static void main(String[] args) {
        adivina_la_pelicula pelicula1 = new adivina_la_pelicula();
        System.out.println(pelicula1.pelicula("1","2","3"));
        System.out.println(pelicula1.pelicula("🧙‍♂️","💍","🔥"));
        System.out.println(pelicula1.pelicula("🦁","👑","🌅"));
    }
    
}



