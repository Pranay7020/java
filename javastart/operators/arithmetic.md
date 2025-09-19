# Java Operators

Operators in Java are special symbols that perform specific operations on one, two, or three operands and then return a result.  

---

## 1. Types of Operators in Java

1. Arithmetic Operators  
2. Relational Operators  
3. Logical Operators  
4. Assignment Operators  
5. Unary Operators  
6. Bitwise Operators  
7. Shift Operators  
8. Ternary (Conditional) Operator  
9. Instanceof Operator  

---

## 2. Arithmetic Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division (quotient) | `a / b` |
| `%` | Modulus (remainder) | `a % b` |

---

## 3. Relational Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `>=` | Greater than or equal to | `a >= b` |
| `<=` | Less than or equal to | `a <= b` |

---

## 4. Logical Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `&&` | Logical AND | `(a > b && b < c)` |
| `\|\|` | Logical OR | `(a > b \|\| b < c)` |
| `!` | Logical NOT | `!(a > b)` |

---

## 5. Assignment Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `=` | Simple assignment | `a = 10` |
| `+=` | Add and assign | `a += 5` → `a = a + 5` |
| `-=` | Subtract and assign | `a -= 5` |
| `*=` | Multiply and assign | `a *= 5` |
| `/=` | Divide and assign | `a /= 5` |
| `%=` | Modulus and assign | `a %= 5` |

---

## 6. Unary Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Unary plus | `+a` |
| `-` | Unary minus | `-a` |
| `++` | Increment | `a++` (post), `++a` (pre) |
| `--` | Decrement | `a--` (post), `--a` (pre) |
| `!` | Logical NOT | `!(true)` → `false` |

---

## 7. Bitwise Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `&` | Bitwise AND | `a & b` |
| `\|` | Bitwise OR | `a \| b` |
| `^` | Bitwise XOR | `a ^ b` |
| `~` | Bitwise NOT | `~a` |

---

## 8. Shift Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `<<` | Left shift | `a << 2` |
| `>>` | Right shift | `a >> 2` |
| `>>>` | Unsigned right shift | `a >>> 2` |

---

## 9. Ternary Operator

A shorthand form of if-else:

```java
variable = (condition) ? value_if_true : value_if_false;
