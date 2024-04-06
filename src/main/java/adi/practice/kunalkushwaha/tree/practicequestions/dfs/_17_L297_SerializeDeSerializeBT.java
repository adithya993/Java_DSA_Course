package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _17_L297_SerializeDeSerializeBT {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder serialize = new StringBuilder();
            helperSerialize(root, serialize);
            return serialize.toString();
        }

        public void helperSerialize(TreeNode node, StringBuilder serialize){
            if(!serialize.isEmpty()){
                serialize.append(",");
            }
            if(node == null){
                serialize.append("null");
                return;
            }
            serialize.append(node.val);
            helperSerialize(node.left, serialize);
            helperSerialize(node.right, serialize);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            List<String> dataReverse = new ArrayList<String>(Arrays.asList(data.split(",")));
            Collections.reverse(dataReverse);
            TreeNode root = helperDeserialize(dataReverse);
            return root;
        }

        public TreeNode helperDeserialize(List<String> dataReversed){
            String val = dataReversed.remove(dataReversed.size() - 1);
            if(val.charAt(0) == 'n'){
                return null;
            }

            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = helperDeserialize(dataReversed);
            node.right = helperDeserialize(dataReversed);
            return node;
        }
    }

    // Your Codec object will be instantiated and called as such:
    // Codec ser = new Codec();
    // Codec deser = new Codec();
    // TreeNode ans = deser.deserialize(ser.serialize(root));
}
