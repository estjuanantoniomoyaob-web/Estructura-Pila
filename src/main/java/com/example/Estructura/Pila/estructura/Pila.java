package com.example.Estructura.Pila.estructura;

public class Pila<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> tope;
    private int size;

    public Pila() {
        this.tope = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void agregar(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        nuevo.siguiente = tope;
        tope = nuevo;
        size++;
    }

    public T quitar() {
        if (tope == null) {
            return null;
        }
        T datoEliminado = tope.dato;
        tope = tope.siguiente;
        size--;
        return datoEliminado;
    }

    public String mostrar() {
        if (tope == null) {
            return "La pila está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = tope;
        sb.append("[Tope] -> ");
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(" -> ");
            }
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}