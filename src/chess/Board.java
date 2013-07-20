package chess;
import java.util.ArrayList;
import static pieces.Pawn.*;
import pieces.Pawn;

/**
 * 체스 보드판을 생성합니다.
 * 체스 말의 개수와, 가지고 있는 Pawn의 목록을 배열로 저장합니다.
 * @author Woonohyo & Minju
 */

public class Board {
	public int numChessman = 0;
	ArrayList<ArrayList<Pawn>> rows = new ArrayList<ArrayList<Pawn>>();

	/**
	 * 체스 보드에 쓰일 여덟개의 row를 생성합니다.
	 */
	public void initialize() {
		rowInit();
		
		rowFiller(0, sBlank);
		rowFiller(1, sWhite);
		rowFiller(2, sBlank);
		rowFiller(3, sBlank);
		rowFiller(4, sBlank);
		rowFiller(5, sBlank);
		rowFiller(6, sBlack);
		rowFiller(7, sBlank);
	}
	
	public void rowInit () {
		for ( int i = 0; i < 8; i++) {
			rows.add(new ArrayList<Pawn>());
		}
	}
	
	public void rowFiller (int num, String sColor) {
		for ( int i = 0; i < 8; i++) {
				rows.get(num).add(new Pawn(sColor));
				if (sColor == sWhite || sColor == sBlack) numChessman++;
		}
	}
}