package com.example.gamedex.data
import com.example.gamedex.model.Jogo

object JogoRepository {
    private val jogos = listOf(
        Jogo(
            id = 1,
            titulo = "Red Dead Redemption 2",
            genero = "Ação e Aventura",
            ano = 2018,
            nota = 9.7,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/1174180/header.jpg?t=1759502961",
            descricao = "Ação e aventura em mundo aberto ambientado no Velho Oeste americano, com narrativa profunda e jogabilidade imersiva"
        ),
        Jogo(
            id = 2,
            titulo = "Batman: Arkham Asylum",
            genero = "Aventura",
            ano = 2009,
            nota = 9.2,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/35140/header.jpg?t=1745966724",
            descricao = "Batman: Arkham Asylum (2009) é um jogo de ação e aventura da Rocksteady Studios. Batman leva o Coringa de volta ao Asilo Arkham, mas tudo é uma armadilha: o vilão toma o controle da ilha e prende o herói junto com os maiores criminosos de Gotham. O jogo combina combate fluido, furtividade, Modo Detetive e exploração, e é considerado um dos melhores jogos de super-herói já feitos."
        ),
        Jogo(
            id = 3,
            titulo = "Grand Theft Auto V",
            genero = "Ação e Aventura",
            ano = 2013,
            nota = 9.7,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/3240220/header.jpg?t=1781187782",
            descricao = "Grand Theft Auto V é um jogo de ação e mundo aberto da Rockstar Games. Ambientado na cidade fictícia de Los Santos, o jogador alterna entre três protagonistas, Michael, Franklin e Trevor, que se envolvem em assaltos de alto risco enquanto tentam sobreviver ao crime organizado e a agentes corruptos. O jogo combina tiroteios, direção, missões de assalto e um modo online, e é um dos jogos mais vendidos de todos os tempos"
        ),
        Jogo(
            id = 4,
            titulo = "EA SPORTS FC 25",
            genero = "Jogo de Futebol",
            ano = 2025,
            nota = 7.6,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/2669320/ec3fb7747fd8080ef53d7686e0d98c5abe1f51f1/header.jpg?t=1788548615",
            descricao = "EA Sports FC 25 é um jogo de futebol da Electronic Arts, sucessor da série FIFA. O jogador controla times e craques de ligas e seleções do mundo todo, com jogabilidade realista e o sistema tático FC IQ. O jogo reúne modos como Ultimate Team, Modo Carreira, Clubes Pro e o Rush, com partidas rápidas de 5 contra 5, além do futebol feminino e do multiplayer online"
        ),
        Jogo(
            id = 5,
            titulo = "Elden Ring",
            genero = "RPG e Aventura",
            ano = 2022,
            nota = 9.6,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/1245620/header.jpg?t=1790290043",
            descricao = "Elden Ring é um RPG de ação e mundo aberto da FromSoftware, com história criada em parceria com George R. R. Martin. O jogador controla um Maculado que explora as Terras Intermédias, enfrentando chefes poderosos e dominando combates desafiadores para se tornar o Lorde Pristino. O jogo combina exploração livre, construção de personagem, combate difícil e cooperação online, e é considerado um dos melhores jogos da sua geração"
        ),
        Jogo(
            id = 6,
            titulo = "Marvels Spider Man 2",
            genero = "Ação e Aventura",
            ano = 2025,
            nota = 9.1,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/2651280/header.jpg?t=1763569811",
            descricao = "Marvel's Spider-Man 2 é um jogo de ação e aventura em mundo aberto da Insomniac Games. O jogador alterna entre Peter Parker e Miles Morales para proteger Nova York de ameaças como Venom e Kraven, o Caçador. O jogo combina combate ágil, balanço pela cidade, habilidades simbióticas e missões de história, e é considerado um dos melhores jogos de super-herói da geração"
        ),
        Jogo(
            id = 7,
            titulo = "Hogwarts Legacy",
            genero = "RPG / Aventura",
            ano = 2023,
            nota = 8.8,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/990080/be2971b1023bccb04f993887d70ef4d2060262cf/header.jpg?t=1790708992",
            descricao = "Hogwarts Legacy é um RPG de ação e mundo aberto da Avalanche Software, ambientado no mundo mágico de Harry Potter no século XIX. O jogador é um estudante do quinto ano que descobre uma antiga magia e precisa impedir rebeldes goblins e bruxos das trevas de usá-la para fins perigosos. O jogo combina exploração de Hogwarts e arredores, aulas, duelos, criaturas mágicas e personalização do personagem, e é um dos jogos mais vendidos de sua geração"
        ),
        Jogo(
            id = 8,
            titulo = "Resident Evil 4",
            genero = "Terror e Ação",
            ano = 2023,
            nota = 9.3,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/2050650/header.jpg?t=1772502922",
            descricao = "Resident Evil 4 Remake é um jogo de survival horror e ação da Capcom, recriação do clássico de 2005. O agente Leon S. Kennedy viaja a uma vila isolada na Europa para resgatar Ashley, filha do presidente dos EUA, e enfrenta aldeões infectados por uma misteriosa seita. O jogo combina tiroteios tensos, combate corpo a corpo com faca, quebra-cabeças, gerenciamento de inventário e chefes marcantes, e é considerado um dos melhores remakes já feitos"
        ),
        Jogo(
            id = 9,
            titulo = "Tomb Raider",
            genero = "Ação e Aventura",
            ano = 2013,
            nota = 9.5,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/203160/13a6dfaa4655377988aa627f03b2322f8bf18ec9/header_alt_assets_0.jpg?t=1792674634",
            descricao = "Tomb Raider é um jogo de ação e aventura da Crystal Dynamics que reinicia a série e mostra a origem de Lara Croft. Após um naufrágio, a jovem arqueóloga fica presa em uma ilha misteriosa e precisa sobreviver a condições extremas e a uma seita hostil enquanto tenta salvar seus amigos. O jogo combina exploração, combate com arco, plataforma, quebra-cabeças e elementos de sobrevivência, e é elogiado pela evolução da personagem e pela ambientação"
        ),
        Jogo(
            id = 10,
            titulo = "Forza Horizon 5",
            genero = "Corrida",
            ano = 2021,
            nota = 9.2,
            imagemUrl = "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/1551360/header.jpg?t=1788546569",
            descricao = "Forza Horizon 5 é um jogo de corrida em mundo aberto da Playground Games, ambientado no México. O jogador participa do Festival Horizon, explorando desertos, selvas, vilas e vulcões com centenas de carros em corridas, desafios e eventos dinâmicos. O jogo combina direção arcade, personalização de veículos, clima e estações do ano variáveis e multiplayer online, e é elogiado pelos gráficos e pela liberdade de exploração"
        )
    )
    fun listar(): List<Jogo> {
        return jogos
    }

    fun buscarPorId(id: Int): Jogo {
        return jogos.first { it.id == id }
    }
}
