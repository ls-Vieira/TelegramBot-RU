package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cardapio {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date data;
	private List<String> cafe = new ArrayList<>();
	private List<String> almoco = new ArrayList<>();
	private List<String> jantar = new ArrayList<>();

	public Cardapio() {
	}

	public Cardapio(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void addCafe(String refeicao) {
		cafe.add(refeicao);
	}

	public void addAlmoco(String refeicao) {
		almoco.add(refeicao);
	}

	public void addJantar(String refeicao) {
		jantar.add(refeicao);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\uD83C\uDF74 Cardápio do dia ");
		sb.append(sdf.format(data) + " \uD83C\uDF74 \n\n");
		sb.append("Café da manhã\n");
		for(String s : cafe) {
			if(!s.equals("CAFE")){
				sb.append(s + "\n");
			}
		}
		sb.append("\n");
		sb.append("Almoço\n");
		for(String s : almoco) {
			if(!s.equals("ALMOCO")){
				sb.append(s + "\n");
			}
		}
		sb.append("\n");
		sb.append("Jantar\n");
		for(String s : jantar) {
			if(!s.equals("JANTAR")){
				sb.append(s + "\n");
			}
		}
		
		return sb.toString();
	}

}
