package org.example;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class ReadWriteLockHashMap {
    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Lock readLock = ReadWriteLock.readLock();





}
