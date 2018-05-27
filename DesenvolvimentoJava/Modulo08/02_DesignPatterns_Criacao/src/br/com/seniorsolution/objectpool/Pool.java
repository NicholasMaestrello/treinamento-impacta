package br.com.seniorsolution.objectpool;

public interface Pool<T> {
	T ocupar();
	void liberar(T t);
}
