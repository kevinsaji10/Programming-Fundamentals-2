/* 
 * thirdBits - return word with every third bit (starting from the LSB) set to 1
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 8
 *   Rating: 1
 */
int thirdBits(void)
{
    int bits9 = 0x49;
    int bits18 = bits9 | (bits9 << 9);
    return bits18 | (bits18 << 18);
}
