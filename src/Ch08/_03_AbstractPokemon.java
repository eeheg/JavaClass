package Ch08;

abstract class Pokemon{
    String name;

    public Pokemon(String name) { //생성자
        this.name = name;
    }

    public String getName() {   // name의 getter
        return name;
    }

    abstract void attack();
    abstract void sound();
}

class Pikachu extends Pokemon{
    public Pikachu() {
        super("피카츄");
    }

    @Override
    void attack() {
        System.out.println("전기공격");
    }

    @Override
    void sound() {
        System.out.println("피카피카");
    }
}

class Squirtle extends Pokemon{
    public Squirtle() {
        super("꼬북이");
    }

    @Override
    void attack() {
        System.out.println("물공격");
    }

    @Override
    void sound() {
        System.out.println("꼬북꼬북");
    }
}

public class _03_AbstractPokemon {
    public static void main(String[] args) {
        Pokemon[] pokemons = new Pokemon[2];
        pokemons[0] = new Pikachu();
        pokemons[1] = new Squirtle();

        for(Pokemon pokemon : pokemons){
            System.out.println("이포켓몬의 이름은 "+pokemon.getName());
            pokemon.attack();
            pokemon.sound();
        }
    }
}