package com.yuceturkomer.hw06;

/**
 * Testing Part1 and Part2
 */
public class MainGeneral {
    public static void main(String[] args) {
        System.out.println("-----------PART 1 TEST---------------");
        HuffmanTree Htree = new HuffmanTree();

        // Create symbol array
        HuffmanTree.HuffData[] symbols = new HuffmanTree.HuffData[]{

                new HuffmanTree.HuffData(186, '_'),
                new HuffmanTree.HuffData(103, 'e'),
                new HuffmanTree.HuffData(80, 't'),
                new HuffmanTree.HuffData(64, 'a'),
                new HuffmanTree.HuffData(63, 'o'),
                new HuffmanTree.HuffData(57, 'i'),
                new HuffmanTree.HuffData(57, 'n'),
                new HuffmanTree.HuffData(51, 's'),
                new HuffmanTree.HuffData(48, 'r'),
                new HuffmanTree.HuffData(47, 'h'),
                new HuffmanTree.HuffData(32, 'd'),
                new HuffmanTree.HuffData(32, 'l'),
                new HuffmanTree.HuffData(23, 'u'),
                new HuffmanTree.HuffData(22, 'c'),
                new HuffmanTree.HuffData(21, 'f'),
                new HuffmanTree.HuffData(20, 'm'),
                new HuffmanTree.HuffData(18, 'w'),
                new HuffmanTree.HuffData(16, 'y'),
                new HuffmanTree.HuffData(15, 'g'),
                new HuffmanTree.HuffData(15, 'p'),
                new HuffmanTree.HuffData(13, 'b'),
                new HuffmanTree.HuffData(8, 'v'),
                new HuffmanTree.HuffData(5, 'k'),
                new HuffmanTree.HuffData(1, 'j'),
                new HuffmanTree.HuffData(1, 'q'),
                new HuffmanTree.HuffData(1, 'x'),
                new HuffmanTree.HuffData(1, 'z')
        };

        // Build hufffman tree
        Htree.buildTree(symbols);

        // Print huffman codes of the symbols
        String EncodedSymbolList = Htree.toString();

        // Decode huffman codes to symbıls
        String code = "110000100111111100101000011";
        String decodedCode = Htree.decode(code);
        System.out.println("Code to Message : \n" + code + " : \t" + decodedCode);
        String encodedCode = Htree.encode(decodedCode);
        System.out.println("\nMessage to encoded code \n" + decodedCode + " : \t" + encodedCode);
        decodedCode = Htree.decode(encodedCode);
        System.out.println("\nEncoded code to Message again : \n" + encodedCode + " : \t" + decodedCode);


        System.out.println("-----------PART 2 TEST---------------");
        BinarySearchTree<Integer> Btree = new BinarySearchTree<Integer>();
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Btree.add(20);
        Btree.add(11);
        Btree.add(0);
        BinarySearchTree.BinaryIterator binIt = Btree.binarySearchIter(Btree.root);

        Btree.add(15);
        Btree.delete(13);
        System.out.println("Without iterator\n" + Btree.toString());
        System.out.println("With itreator");
        while (binIt.hasNext()) {
            BinaryTree.Node testNode = binIt.next();
            System.out.println(testNode);
        }


    }
}
