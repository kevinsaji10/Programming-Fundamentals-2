/* 
 * bitXor - x^y using only ~ and & 
 *   Example: bitXor(4, 5) = 1
 *   Legal ops: ~ &
 *   Max ops: 14
 *   Rating: 1
 */
int bitXor(int x, int y)
{
    int x_and_y = x & y;
    int x_or_y = ~(~x & ~y);
    return x_or_y & ~x_and_y;
}
