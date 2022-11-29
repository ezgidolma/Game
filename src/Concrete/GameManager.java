package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.GameName+"oyunu "+game.Price+"fiyatıyla eklendi.");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.GameName+"oyunu "+game.Price+"fiyatıyla silindi.");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.GameName+"oyunu "+game.Price+"fiyatıyla güncellendi.");
		
	}

}
