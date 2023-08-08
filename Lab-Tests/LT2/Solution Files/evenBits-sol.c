/* 
 * evenBits - return word with all even-numbered bits set to 1
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 8
 *   Rating: 1
 */
int evenBits(void)
{
    int byte = 0x55;
    int word = byte | byte << 8;
    return word | word << 16;
}
