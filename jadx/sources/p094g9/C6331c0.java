package p094g9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: g9.c0 */
public final class C6331c0 implements List, RandomAccess {

    /* renamed from: d */
    private final List f19451d;

    private C6331c0(List list) {
        this.f19451d = Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static C6331c0 m25210b(List list) {
        return new C6331c0(list);
    }

    /* renamed from: c */
    public static C6331c0 m25211c(Object... objArr) {
        return new C6331c0(Arrays.asList(objArr));
    }

    public boolean add(Object obj) {
        return this.f19451d.add(obj);
    }

    public boolean addAll(Collection collection) {
        return this.f19451d.addAll(collection);
    }

    public void clear() {
        this.f19451d.clear();
    }

    public boolean contains(Object obj) {
        return this.f19451d.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f19451d.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f19451d.equals(obj);
    }

    public Object get(int i) {
        return this.f19451d.get(i);
    }

    public int hashCode() {
        return this.f19451d.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f19451d.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f19451d.isEmpty();
    }

    public Iterator iterator() {
        return this.f19451d.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f19451d.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return this.f19451d.listIterator();
    }

    public boolean remove(Object obj) {
        return this.f19451d.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return this.f19451d.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.f19451d.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        return this.f19451d.set(i, obj);
    }

    public int size() {
        return this.f19451d.size();
    }

    public List subList(int i, int i2) {
        return this.f19451d.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f19451d.toArray();
    }

    public void add(int i, Object obj) {
        this.f19451d.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return this.f19451d.addAll(i, collection);
    }

    public ListIterator listIterator(int i) {
        return this.f19451d.listIterator(i);
    }

    public Object remove(int i) {
        return this.f19451d.remove(i);
    }

    public Object[] toArray(Object[] objArr) {
        return this.f19451d.toArray(objArr);
    }
}
