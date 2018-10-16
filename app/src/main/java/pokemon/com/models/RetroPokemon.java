package pokemon.com.models;

public class RetroPokemon {

    public String id;
    public String name;
    public Integer nationalPokedexNumber;
    public String imageUrl;
    public String hp;
    public String number;

    public RetroPokemon(String id, String name, Integer nationalPokedexNumber, String imageUrl, String hp, String number) {
        this.id = id;
        this.name = name;
        this.nationalPokedexNumber = nationalPokedexNumber;
        this.imageUrl = imageUrl;
        this.hp = hp;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNationalPokedexNumber() {
        return nationalPokedexNumber;
    }

    public void setNationalPokedexNumber(Integer nationalPokedexNumber) {
        this.nationalPokedexNumber = nationalPokedexNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }





}
