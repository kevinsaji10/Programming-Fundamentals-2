/*
 * isTmax - returns 1 if x is the maximum, two's complement number,
 *     and 0 otherwise 
 *   Legal ops: ! ~ & ^ | +
 *   Max ops: 10
 *   Rating: 1
 */
int isTmax(int x)
{
    int nx = ~x;
    int nxnz = !!nx;
    int nxovf = !(nx + nx);
    return nxnz & nxovf;
}
