/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author W7u
 */
public class ChessException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    ChessException(String msg){
        super(msg);
    }
    
}
