public class ClassificadorDeHeroi {
    public static void main(String[] args) {
        Heroi[] herois = {
                new Heroi("Batman", 99999),
                new Heroi("Superman", 10167),
                new Heroi("Flash", 9988),
                new Heroi("Mulher Maravilha", 4501),
                new Heroi("Aquaman", 4734),
                new Heroi("Cyborg", 1990)
        };

        for (Heroi heroi : herois) {
            String nivelHeroi = null;
            if (heroi.xp < 1000) {
                nivelHeroi = "Ferro";
            } else if (heroi.xp > 1000 && heroi.xp < 2000) {
                nivelHeroi = "Bronze";
            } else if (heroi.xp > 2000 && heroi.xp < 5000) {
                nivelHeroi = "Prata";
            } else if (heroi.xp > 6000 && heroi.xp < 7000) {
                nivelHeroi = "Ouro";
            } else if (heroi.xp > 7000 && heroi.xp < 8000) {
                nivelHeroi = "Platina";
            } else if (heroi.xp > 8000 && heroi.xp < 9000) {
                nivelHeroi = "Ascendente";
            } else if (heroi.xp > 9000 && heroi.xp < 10000) {
                nivelHeroi = "Imortal";
            } else {
                nivelHeroi = "Radiante";
            }
            System.out.println("O Herói de nome " + heroi.nome + " está no nível de " + nivelHeroi);
        }
    }
}
