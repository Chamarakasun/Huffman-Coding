/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_exam._1;

/**
 *
 * @author Chamara
 */
class Huffman_Node
{
    Character charac;
    Integer frequency;
    Huffman_Node left = null, right = null;

    Huffman_Node(Character charac, Integer frequency)
    {
        this.charac = charac;
        this.frequency = frequency;
    }

    public Huffman_Node(Character charac, Integer frequency, Huffman_Node left, Huffman_Node right)
    {
        this.charac = charac;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}
