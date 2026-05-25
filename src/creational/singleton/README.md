# Singleton Pattern

Ensures a class has only one instance and provides a global access point to it.

---

## Implementations

### 🟢 Eager Initialization
The instance is created at class loading time, regardless of whether it is used or not.

### 🔵 Lazy Initialization
The instance is created only when it is first requested.

Includes:

- **Simple Lazy**  
  Not thread-safe.

- **Synchronized Method**  
  Thread-safe but has performance overhead due to locking.

- **Double-Checked Locking (DCL)**  
  Thread-safe and more efficient. Uses `synchronized` block with `volatile` to prevent instruction reordering and ensure visibility.

- **Bill Pugh (Recommended)**  
  Uses a static inner helper class. Thread-safe, lazy-loaded, and does not require synchronization.

---

## Key Tradeoff

- **Eager**: Fast access, but instance is always created (even if unused)
- **Lazy**: Efficient resource usage, but requires thread-safety handling