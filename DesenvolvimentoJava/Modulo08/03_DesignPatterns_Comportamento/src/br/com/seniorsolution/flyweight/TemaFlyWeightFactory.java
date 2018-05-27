package br.com.seniorsolution.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TemaFlyWeightFactory {

	private static Map<Class<? extends TemaFlyWeight>, TemaFlyWeight> temas =
			new HashMap<>();

	public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN= TemaHifen.class;
	public static final Class<TemaSenior> SENIOR= TemaSenior.class;

	public static TemaFlyWeight getTema(Class<? extends TemaFlyWeight> cl) {
		if(!temas.containsKey(cl))
			try {
				temas.put(cl, cl.newInstance());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		return temas.get(cl);
	}
}