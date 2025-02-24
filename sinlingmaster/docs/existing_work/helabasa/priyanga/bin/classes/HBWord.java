 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *   P h o n o t i c a l   a n a l y s i s   o f   a   g i v e   w o r d  
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
  
 p u b l i c   c l a s s   H B W o r d   {  
  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B W _ S W A R A   	 	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t 	 H B W _ H A L 	 	 	 =   2 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t 	 H B W _ C O M B I N E D   	 =   3 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t 	 H B W _ U N D E F I N E D   	 =   4 ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B W _ C H A R _ A N Y 	 	 	 =   " * " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B W _ C H A R _ S W A R A 	 	 =   " S " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B W _ C H A R _ G A T H R A K S H A R A =   " G " ; 	  
 	  
 	 p r i v a t e   S t r i n g   s _ N a t u r a l   =   " " ;  
 	 p r i v a t e   L i s t < S t r i n g >   l i s t s _ B a s e C h a r s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 p r i v a t e   l o n g 	 l _ F r e q u e n c y   =   0 ;  
 	 / * *  
 	   *    
 	   * /  
 	  
 	 p u b l i c   H B W o r d ( )  
 	 {  
 	 	 l _ F r e q u e n c y   =   0 ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d ( S t r i n g   s N a t u r a l F o r m )    
 	 {  
 	 	 S e t N a t u r a l S t r i n g ( s N a t u r a l F o r m ) ;  
 	 	 l _ F r e q u e n c y   =   0 ;  
 	 }  
  
 	 p u b l i c   v o i d   S e t N a t u r a l S t r i n g ( S t r i n g   s N a t u r a l F o r m )  
 	 {  
 	 	 s _ N a t u r a l   =   s N a t u r a l F o r m ;  
 	 	 i n t   i L e n   =   s N a t u r a l F o r m . l e n g t h ( ) ;  
 	 	 i n t   i P o s   =   0 ;  
 	 	 l i s t s _ B a s e C h a r s . c l e a r ( ) ;  
 	 	  
 	 	 w h i l e ( i P o s   <   i L e n )  
 	 	 {  
 	 	 	 i P o s   + =   E x t r a c t B a s e C h a r a c t e r s ( s N a t u r a l F o r m ,   i P o s ) ;  
 	 	 }  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   s N a t u r a l C h a r  
 	   *   @ r e t u r n  
 	   * /  
 	 p r i v a t e   i n t   E x t r a c t B a s e C h a r a c t e r s ( S t r i n g   s N a t u r a l C h a r ,   i n t   i B e g i n )  
 	 {  
 	 	 i n t   i L e n   =   s N a t u r a l C h a r . l e n g t h ( ) ;  
 	 	 / *  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c f ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 0 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 1 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 2 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 3 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 4 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 6 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 9 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d a ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d c ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d d ]  
 	 	�� �   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d c f ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d 0 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d 1 ]  
 	 	��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 8 ]  
 	 	���   =  �   [ 0 d c 3 ]   +  ��   [ 0 d f 2 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d 9 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d a ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d c ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b b ]   +  �   [ 0 d d d ]  
 	 	�� �   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d c f ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 0 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 1 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 2 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 3 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 4 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 6 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d 9 ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d a ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d c ]  
 	 	�� ��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]   +      [ 0 2 0 0 d ]   +  �   [ 0 d b a ]   +  �   [ 0 d d d ]  
 	 	 * /  
 	 	  
 	 	 i f ( i L e n - i B e g i n = = 0 )  
 	 	 {  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	 c h a r   c M a i n   =   s N a t u r a l C h a r . c h a r A t ( i B e g i n ) ;  
 	 	  
 	 	 i f ( c M a i n = = ' * ' )  
 	 	 { 	 	 	  
 	 	 	 l i s t s _ B a s e C h a r s . a d d ( " * " ) ; 	  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	 e l s e   i f ( c M a i n = = ' S ' )  
 	 	 {  
 	 	 	 l i s t s _ B a s e C h a r s . a d d ( " S " ) ; 	  
 	 	 	 r e t u r n   1 ; 	 	 	  
 	 	 }  
 	 	 e l s e   i f ( c M a i n = = ' G ' )  
 	 	 {  
 	 	 	 l i s t s _ B a s e C h a r s . a d d ( " G " ) ; 	  
 	 	 	 r e t u r n   1 ; 	 	 	  
 	 	 }  
 	 	 e l s e   i f ( H e l a b a s a . I s S i n h a l a C h a r a c t e r ( c M a i n ) = = f a l s e )  
 	 	 {  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	  
 	 	 i f ( i L e n - i B e g i n   >   0 )  
 	 	 {  
 	 	 	 i f (   H e l a b a s a . I s H a l L e t t e r ( s N a t u r a l C h a r . c h a r A t ( i B e g i n ) )   )  
 	 	 	 {  
 	 	 	 	 i f ( i L e n - i B e g i n   >   1 )  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 c h a r   c P o s t M o d   =   s N a t u r a l C h a r . c h a r A t ( i B e g i n   +   1 ) ;  
 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 S t r i n g B u i l d e r   s b M a i n   =   n e w   S t r i n g B u i l d e r ( ) ; 	  
 	 	 	 	 	  
 	 	 	 	 	 s w i t c h ( c P o s t M o d )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 c a s e   H e l a b a s a . c _ H A L K I R E E M A :   / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c a ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	 	  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' :   / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c f ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 0 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 1 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 2 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 3 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 4 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 6 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 9 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d a ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d c ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d d ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 } 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 8 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   ' \ u 0 d f 2 ' : / /���   =  �   [ 0 d c 3 ]   +  ��   [ 0 d f 2 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   2 ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 d e f a u l t :  
 	 	 	 	 	 	 { 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 	 	 r e t u r n   1 ; 	 	 	 	 	 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 S t r i n g B u i l d e r   s b M a i n   =   n e w   S t r i n g B u i l d e r ( ) ; 	 	 	 	 	  
 	 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 s b M a i n . a p p e n d ( H e l a b a s a . c _ H A L K I R E E M A ) ;  
 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ; 	 	 	 	 	  
 	 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( "� " ) ;  
 	 	 	 	 	 r e t u r n   1 ;  
 	 	 	 	 } 	 	 	 	  
 	 	 	 }  
 	 	 	 e l s e   i f (   H e l a b a s a . I s S w a r a L e t t e r ( c M a i n )   )  
 	 	 	 {  
 	 	 	 	 S t r i n g B u i l d e r   s b M a i n   =   n e w   S t r i n g B u i l d e r ( ) ; 	 	 	 	 	  
 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ; 	 	 	 	  
 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ;  
 	 	 	 	 r e t u r n   1 ;  
 	 	 	 }  
 	 	 	 e l s e   i f (   H e l a b a s a . I s H a l f S w a r a L e t t e r ( c M a i n )   )  
 	 	 	 {  
 	 	 	 	 S t r i n g B u i l d e r   s b M a i n   =   n e w   S t r i n g B u i l d e r ( ) ; 	 	 	 	 	  
 	 	 	 	 s b M a i n . a p p e n d ( c M a i n ) ; 	 	 	 	  
 	 	 	 	 l i s t s _ B a s e C h a r s . a d d ( s b M a i n . t o S t r i n g ( ) ) ;  
 	 	 	 	 r e t u r n   1 ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 	 r e t u r n   1 ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t B a s e F o r m ( S t r i n g   s B a s e F o r m )  
 	 {  
 	 	 S y s t e m . o u t . p r i n t l n ( " S p l i t t i n g   :   "   +   s B a s e F o r m ) ;  
 	 	 S t r i n g [ ]   a s B a s e C h a r s   =   s B a s e F o r m . s p l i t ( " \ \ + " ) ;  
 	 	 i n t   i L e n   =   a s B a s e C h a r s . l e n g t h ;  
 	 	 l i s t s _ B a s e C h a r s . c l e a r ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
 	 	 {  
 	 	 	 l i s t s _ B a s e C h a r s . a d d ( a s B a s e C h a r s [ i ] ) ;  
 	 	 }  
  
 	 	 R e f r e s h N a t u r a l S t r i n g ( ) ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   C l o n e ( )  
 	 {  
 	 	 H B W o r d   o N e w   =   n e w   H B W o r d ( ) ;  
 	 	  
 	 	 o N e w . s _ N a t u r a l   =   s _ N a t u r a l ;  
 	 	  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
 	 	 {  
 	 	 	 o N e w . l i s t s _ B a s e C h a r s . a d d ( l i s t s _ B a s e C h a r s . g e t ( i ) ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   o N e w ;  
 	 }  
 	  
 	 p r i v a t e   v o i d   R e f r e s h N a t u r a l S t r i n g ( )  
 	 {  
 	 	 S t r i n g B u i l d e r   s b N a t u r a l   =   n e w   S t r i n g B u i l d e r ( ) ;  
 	 	  
 	 	 i n t   i P o s   =   0 ;  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	  
 	 	 w h i l e ( i P o s   <   i L e n )  
 	 	 {  
 	 	 	 i P o s   + =   J o i n B a s e C h a r a c t e r s ( i P o s ,   s b N a t u r a l ) ;  
 	 	 } 	 	  
 	 	  
 	 	 s _ N a t u r a l   =   s b N a t u r a l . t o S t r i n g ( ) ; 	 	  
 	 }  
 	  
 	 p r i v a t e   S t r i n g   G e n e r a t e N a t u r a l S t r i n g ( i n t   i B e g i n ,   i n t   i E n d )  
 	 {  
 	 	 S t r i n g B u i l d e r   s b N a t u r a l   =   n e w   S t r i n g B u i l d e r ( ) ;  
 	 	  
 	 	 i n t   i P o s   =   i B e g i n ;  
 	 	 i n t   i L e n   =   i E n d ;  
 	 	  
 	 	 w h i l e ( i P o s   <   i L e n )  
 	 	 {  
 	 	 	 i P o s   + =   J o i n B a s e C h a r a c t e r s ( i P o s ,   s b N a t u r a l ) ;  
 	 	 } 	 	  
 	 	  
 	 	 r e t u r n   s b N a t u r a l . t o S t r i n g ( ) ; 	 	  
 	 } 	  
 	  
 	 p r i v a t e   i n t   J o i n B a s e C h a r a c t e r s ( i n t   i B e g i n ,   S t r i n g B u i l d e r   s b O u t )  
 	 {  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	 	 	  
 	 	 i f ( i L e n - i B e g i n = = 0 )  
 	 	 {  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	 S t r i n g   s M a i n   =   l i s t s _ B a s e C h a r s . g e t ( i B e g i n ) ;  
 	 	 i f ( s M a i n . e q u a l s ( " * " )   | |   s M a i n . e q u a l s ( " S " )   | |   s M a i n . e q u a l s ( " G " )   )   / / W i l d   C a r d   L e t t e r  
 	 	 {  
 	 	 	 s b O u t . a p p e n d ( s M a i n ) ;  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	 e l s e   i f ( s M a i n . l e n g t h ( ) = = 1 )   / / S w a r a   L e t t e r  
 	 	 {  
 	 	 	 s b O u t . a p p e n d ( s M a i n ) ;  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	 e l s e   i f ( i L e n - i B e g i n   >   1   & &   s M a i n . l e n g t h ( ) > 1 )  
 	 	 {  
 	 	 	 i f (   s M a i n . c h a r A t ( 1 )   = =   H e l a b a s a . c _ H A L K I R E E M A   )  
 	 	 	 {  
 	 	 	 	 i n t   i J o i n e d C h a r s   =   0 ;  
 	 	 	 	 c h a r   c M a i n   =   s M a i n . c h a r A t ( 0 ) ; 	 	 	 	  
 	 	 	 	 S t r i n g   s N e x t   =   l i s t s _ B a s e C h a r s . g e t ( i B e g i n   +   1 ) ;  
 	 	 	 	 i f ( s N e x t . e q u a l s ( "�� " )   & &   i L e n - i B e g i n   >   2 )  
 	 	 	 	 {  
 	 	 	 	 	 i J o i n e d C h a r s   =   1 ;  
 	 	 	 	 	 s b O u t . a p p e n d ( s M a i n ) ; 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( ' \ u 2 0 0 d ' ) ; 	 	 	 	  
 	 	 	 	 	 c M a i n   =   '� ' ;  
 	 	 	 	 	 s N e x t   =   l i s t s _ B a s e C h a r s . g e t ( i B e g i n   +   2 ) ;  
 	 	 	 	 }  
 	 	 	 	 e l s e   i f ( s N e x t . e q u a l s ( "�� " )   & &   i L e n - i B e g i n   >   2 )  
 	 	 	 	 {  
 	 	 	 	 	 i J o i n e d C h a r s   =   1 ;  
 	 	 	 	 	 s b O u t . a p p e n d ( s M a i n ) ;  
 	 	 	 	 	 s b O u t . a p p e n d ( ' \ u 2 0 0 d ' ) ;  
 	 	 	 	 	 c M a i n   =   '� ' ;  
 	 	 	 	 	 s N e x t   =   l i s t s _ B a s e C h a r s . g e t ( i B e g i n   +   2 ) ; 	 	 	 	 	  
 	 	 	 	 } 	 	 	  
 	 	 	 	  
 	 	 	 	 i f ( s N e x t . l e n g t h ( ) = = 1 )  
 	 	 	 	 {  
 	 	 	 	 	 c h a r   c V o w e l   =   s N e x t . c h a r A t ( 0 ) ;  
 	 	 	 	 	 s w i t c h ( c V o w e l )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 c a s e   '� ' :  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ; 	 	 	 	 	 	  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' :   / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d c f ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ; 	 	 	 	 	 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 0 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ; 	 	 	 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 1 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ; 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 2 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 3 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 4 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 6 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 9 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d a ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d c ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d d ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 } 	 	  
 	 	 	 	 	 	 c a s e   '� ' : / /��   =  �   [ 0 d c 3 ]   +  �   [ 0 d d 8 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( '� ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 c a s e   ' \ u 0 d f 2 ' : / /���   =  �   [ 0 d c 3 ]   +  ��   [ 0 d f 2 ]  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( c M a i n ) ;  
 	 	 	 	 	 	 	 s b O u t . a p p e n d ( ' \ u 0 d f 2 ' ) ;  
 	 	 	 	 	 	 	 r e t u r n   2   +   i J o i n e d C h a r s ;  
 	 	 	 	 	 	 } 	 	 	 	 	 	  
 	 	 	 	 	 	 d e f a u l t :  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 r e t u r n   1   +   i J o i n e d C h a r s ; 	 	 	 	 	 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 / / E n d   o f   s o u n d  
 	 	 	 	 	 s b O u t . a p p e n d ( s M a i n ) ;  
 	 	 	 	 	 r e t u r n   1 ;  
 	 	 	 	 } 	 	 	 	  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 e l s e   / / H a l   L e t t e r   a t   t h e   e n d  
 	 	 {  
 	 	 	 s b O u t . a p p e n d ( s M a i n ) ;  
 	 	 	 r e t u r n   1 ; 	 	 	  
 	 	 }  
 	 	 r e t u r n   1 ;  
 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   A p p e n d B a s e F o r m ( S t r i n g   s B a s e F o r m )  
 	 {  
 	 	 S t r i n g   s C o m b B a s e   =   G e t B a s e F o r m ( )   +   " + "   +   s B a s e F o r m ;  
 	 	 S e t B a s e F o r m ( s C o m b B a s e ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A p p e n d B a s e C h a r a c t e r ( S t r i n g   s B a s e C h a r a c t e r )  
 	 {  
 	 	 l i s t s _ B a s e C h a r s . a d d ( s B a s e C h a r a c t e r ) ;  
 	 	 R e f r e s h N a t u r a l S t r i n g ( ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   P r e p e n d B a s e C h a r a c t e r ( S t r i n g   s B a s e C h a r a c t e r )  
 	 {  
 	 	 l i s t s _ B a s e C h a r s . a d d ( 0 ,   s B a s e C h a r a c t e r ) ;  
 	 	 R e f r e s h N a t u r a l S t r i n g ( ) ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   A p p e n d N a t u r a l F o r m ( S t r i n g   s N a t u r a l F o r m )  
 	 {  
 	 	 S t r i n g   s C o m b N a t u r a l   =   G e t N a t u r a l F o r m ( )   +   s N a t u r a l F o r m ;  
 	 	 S e t N a t u r a l S t r i n g ( s C o m b N a t u r a l ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A p p e n d ( H B W o r d   o W o r d )  
 	 {  
 	 	 i n t   i B C C o u n t   =   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) ;    
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i B C C o u n t ;   i + + )  
 	 	 {  
 	 	 	 l i s t s _ B a s e C h a r s . a d d ( o W o r d . G e t B a s e C h a r a c t e r A t ( i ) ) ;  
 	 	 }  
 	  
 	 	 R e f r e s h N a t u r a l S t r i n g ( ) ; 	 	  
 	 }  
   	  
 	 p u b l i c   i n t   G e t N a t u r a l C h a r a c t e r C o u n t ( )  
 	 {  
 	 	 r e t u r n   s _ N a t u r a l . l e n g t h ( ) ;  
 	 }  
 	  
 	 p u b l i c   c h a r   G e t N a t u r a l C h a r a c t e r A t ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   s _ N a t u r a l . c h a r A t ( i P o s ) ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t N a t u r a l F o r m ( )  
 	 {  
 	 	 r e t u r n   s _ N a t u r a l ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t B a s e C h a r a c t e r C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t B a s e C h a r a c t e r A t ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t s _ B a s e C h a r s . g e t ( i P o s ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t B a s e C h a r a c t e r F r o m E n d ( i n t   i P o s )  
 	 {  
 	 	 i f ( l i s t s _ B a s e C h a r s . s i z e ( ) > i P o s )  
 	 	 {  
 	 	 	 r e t u r n   l i s t s _ B a s e C h a r s . g e t ( l i s t s _ B a s e C h a r s . s i z e ( )   -   i P o s   -   1 ) ;  
 	 	 }  
 	 	 r e t u r n   " " ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   S u b N a t u r a l F o r m S t r i n g ( i n t   i B a s e F o r m B e g i n ,   i n t   i B a s e F o r m E n d )  
 	 {  
 	 	 i f ( i B a s e F o r m B e g i n   >   i B a s e F o r m E n d )  
 	 	 {  
 	 	 	 r e t u r n   " " ;  
 	 	 }  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	  
 	 	 i f ( i B a s e F o r m B e g i n   <   i L e n   & &   i B a s e F o r m E n d   <   i L e n )  
 	 	 {  
 	 	 	 r e t u r n   G e n e r a t e N a t u r a l S t r i n g ( i B a s e F o r m B e g i n ,   i B a s e F o r m E n d ) ;  
 	 	 }  
 	 	 e l s e   i f ( i B a s e F o r m E n d   > =   i L e n )  
 	 	 {  
 	 	 	 r e t u r n   G e n e r a t e N a t u r a l S t r i n g ( i B a s e F o r m B e g i n ,   i L e n - 1 ) ;  
 	 	 }  
  
 	 	 r e t u r n   " " ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   S u b B a s e F o r m S t r i n g ( i n t   i B a s e F o r m B e g i n ,   i n t   i B a s e F o r m E n d )  
 	 { 	 	  
 	 	 i f ( i B a s e F o r m B e g i n   >   i B a s e F o r m E n d )  
 	 	 {  
 	 	 	 r e t u r n   " " ;  
 	 	 }  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	  
 	 	 i f ( i B a s e F o r m B e g i n   <   i L e n   & &   i B a s e F o r m E n d   <   i L e n )  
 	 	 {  
 	 	 	 r e t u r n   G e n e r a t e B a s e F o r m S t r i n g ( i B a s e F o r m B e g i n ,   i B a s e F o r m E n d ) ;  
 	 	 }  
 	 	 e l s e   i f ( i B a s e F o r m E n d   > =   i L e n )  
 	 	 {  
 	 	 	 r e t u r n   G e n e r a t e B a s e F o r m S t r i n g ( i B a s e F o r m B e g i n ,   i L e n - 1 ) ;  
 	 	 }  
  
 	 	 r e t u r n   " " ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   S u b W o r d ( i n t   i B a s e F o r m B e g i n ,   i n t   i B a s e F o r m E n d )  
 	 {  
 	 	 H B W o r d   o N e w W o r d   =   n e w   H B W o r d ( ) ;  
 	 	  
 	 	 i n t   i B C C o u n t   =   G e t B a s e C h a r a c t e r C o u n t ( ) ;    
 	 	 i f ( i B a s e F o r m E n d   >   i B C C o u n t )  
 	 	 {  
 	 	 	 i B a s e F o r m E n d   =   i B C C o u n t ;  
 	 	 }  
 	 	  
 	 	 i f ( i B a s e F o r m B e g i n   >   i B a s e F o r m E n d )  
 	 	 {  
 	 	 	 r e t u r n   o N e w W o r d ;  
 	 	 } 	 	  
 	 	 	 	  
 	 	 f o r ( i n t   i = i B a s e F o r m B e g i n ;   i < i B a s e F o r m E n d ;   i + + )  
 	 	 {  
 	 	 	 o N e w W o r d . l i s t s _ B a s e C h a r s . a d d ( G e t B a s e C h a r a c t e r A t ( i ) ) ;  
 	 	 }  
 	  
 	 	 o N e w W o r d . R e f r e s h N a t u r a l S t r i n g ( ) ;  
 	 	 r e t u r n   o N e w W o r d ;  
 	 } 	  
 	  
 	 p u b l i c   S t r i n g   G e t B a s e F o r m ( )  
 	 {  
 	 	 S t r i n g B u i l d e r   s b B a s e F o r m   =   n e w   S t r i n g B u i l d e r ( ) ; 	  
 	 	 i n t   i L e n   =   l i s t s _ B a s e C h a r s . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
 	 	 {  
 	 	 	 s b B a s e F o r m . a p p e n d ( l i s t s _ B a s e C h a r s . g e t ( i ) ) ;  
 	 	 	 i f ( i < i L e n - 1 )  
 	 	 	 {  
 	 	 	 	 s b B a s e F o r m . a p p e n d ( " + " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   s b B a s e F o r m . t o S t r i n g ( ) ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t L a s t C h a r a c t e r T y p e ( )  
 	 {  
 	 	 i n t   i C C o u n t   =   G e t B a s e C h a r a c t e r C o u n t ( ) ;    
 	 	 i f ( i C C o u n t > 1 )  
 	 	 {  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) . c h a r A t ( 0 ) ) )  
 	 	 	 {  
 	 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r F r o m E n d ( 1 ) . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   H B W _ S W A R A ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   H B W _ C O M B I N E D ;  
 	 	 	 	 } 	  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ H A L ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e   i f ( i C C o u n t > 0 )  
 	 	 {  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r F r o m E n d ( 0 ) . c h a r A t ( 0 ) ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ S W A R A ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ H A L ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 r e t u r n   H B W _ U N D E F I N E D ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t F i r s t C h a r a c t e r T y p e ( )  
 	 {  
 	 	 i n t   i C C o u n t   =   G e t B a s e C h a r a c t e r C o u n t ( ) ;    
 	 	 i f ( i C C o u n t > 1 )  
 	 	 {  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r A t ( 0 ) . c h a r A t ( 0 ) ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ S W A R A ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 { 	 	 	 	  
 	 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r A t ( 1 ) . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   H B W _ C O M B I N E D ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   H B W _ H A L ;  
 	 	 	 	 } 	 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	 e l s e   i f ( i C C o u n t > 0 )  
 	 	 {  
 	 	 	 i f ( H e l a b a s a . I s S w a r a L e t t e r ( G e t B a s e C h a r a c t e r A t ( 0 ) . c h a r A t ( 0 ) ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ S W A R A ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 r e t u r n   H B W _ H A L ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 r e t u r n   H B W _ U N D E F I N E D ;  
 	 } 	  
 	  
 	 p r i v a t e   S t r i n g   G e n e r a t e B a s e F o r m S t r i n g ( i n t   i B e g i n ,   i n t   i E n d )  
 	 {  
 	 	 S t r i n g B u i l d e r   s b B a s e F o r m   =   n e w   S t r i n g B u i l d e r ( ) ; 	  
 	  
 	 	 f o r ( i n t   i = i B e g i n ;   i < i E n d ;   i + + )  
 	 	 {  
 	 	 	 s b B a s e F o r m . a p p e n d ( l i s t s _ B a s e C h a r s . g e t ( i ) ) ;  
 	 	 	 i f ( i < i E n d - 1 )  
 	 	 	 {  
 	 	 	 	 s b B a s e F o r m . a p p e n d ( " + " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   s b B a s e F o r m . t o S t r i n g ( ) ;  
 	 }  
 	  
 	 p u b l i c   b o o l e a n   E q u a l s ( H B W o r d   o W o r d )  
 	 { 	 	 	 	  
 	 	 i n t   i P o s   =   0 ;  
 	 	 i n t   i L i m i t   =   0 ;  
 	 	  
 	 	 i f ( t h i s . G e t B a s e C h a r a c t e r C o u n t ( )   ! =   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) )  
 	 	 {  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 i L i m i t   =   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 }  
 	 	  
 	 	 i f ( i L i m i t = = 0 )  
 	 	 {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 w h i l e ( i P o s < i L i m i t )    
 	 	 { 	 	 	  
 	 	 	 S t r i n g   s C 1   =   t h i s . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	 S t r i n g   s C 2   =   o W o r d . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	  
 	 	 	 i f ( ! s C 1 . e q u a l s ( s C 2 ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 } 	 	  
 	 	 	 i P o s + + ;  
 	 	 } 	 	  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 / / T h i s   w o r d   m u s t   b e   a   p a t t e r n  
 	 / / G i v e n   w o r d   m u s t   b e   a   n a t u r a l   w o r d  
 	 / / C h e c k s   t h e   g i v e n   w o r d   a g a i n s t   t h i s   p a t t e r n  
 	 p u b l i c   i n t   M a t c h ( H B W o r d   o W o r d )  
 	 {  
 	 	 / / s u p p o r t s   * [ S , G ] x   t y p e   e x p r e s s i o n s  
 	 	  
 	 	 i n t   i P o s   =   0 ;  
 	 	 i n t   i L i m i t   =   0 ;  
 	 	  
 	 	 i f ( t h i s . G e t B a s e C h a r a c t e r C o u n t ( )   <   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) )  
 	 	 {  
 	 	 	 i L i m i t   =   t h i s . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 i L i m i t   =   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 }  
 	 	  
 	 	 i f ( i L i m i t = = 0 )  
 	 	 {  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 w h i l e ( i P o s < i L i m i t )    
 	 	 { 	 	 	  
 	 	 	 S t r i n g   s C 1   =   t h i s . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	 S t r i n g   s C 2   =   o W o r d . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	  
 	 	 	 i P o s + + ;  
 	 	 	  
 	 	 	 i f ( s C 1 . e q u a l s ( H B W _ C H A R _ A N Y ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   i P o s ;  
 	 	 	 }  
 	 	 	 e l s e   i f ( s C 1 . e q u a l s ( H B W _ C H A R _ G A T H R A K S H A R A ) )  
 	 	 	 {  
 	 	 	 	 i f ( ! H e l a b a s a . I s H a l L e t t e r ( s C 2 . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   0 ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 e l s e   i f ( s C 1 . e q u a l s ( H B W _ C H A R _ S W A R A ) )  
 	 	 	 {  
 	 	 	 	 i f ( ! H e l a b a s a . I s S w a r a L e t t e r ( s C 2 . c h a r A t ( 0 ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   0 ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 i f ( ! s C 1 . e q u a l s ( s C 2 ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   0 ;  
 	 	 	 	 } 	 	 	 	  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 	 r e t u r n   i P o s ;  
 	 }  
 	  
 	 / * *  
 	   *    
 	   *   @ p a r a m   o P a r t   -   C a n   b e   a   n a t u r a l   w o r d   o r   a   p a t t e r n  
 	   *   @ r e t u r n  
 	   * /  
 	 p u b l i c   b o o l e a n   E n d s W i t h ( H B W o r d   o P a r t )  
 	 {  
 	 	 i n t   i T h i s L e n   =   G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 i n t   i P a r t L e n   =   o P a r t . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 i f ( i T h i s L e n > = i P a r t L e n )  
 	 	 {  
 	 	 	 f o r ( i n t   i = 0 ;   i < i P a r t L e n ;   i + + )  
 	 	 	 { 	 	 	  
 	 	 	 	  
 	 	 	 	 S t r i n g   s P a r t C h a r   =   o P a r t . G e t B a s e C h a r a c t e r A t ( i P a r t L e n   -   1   - i ) ;  
 	 	 	 	 S t r i n g   s T h i s C h a r   =   G e t B a s e C h a r a c t e r A t ( i T h i s L e n   -   1   - i ) ;  
 	 	 	 	 i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ A N Y ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s S i n h a l a C h a r a c t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e   i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ S W A R A ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s S w a r a L e t t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e   i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ G A T H R A K S H A R A ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s H a l L e t t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 e l s e   i f ( ! s T h i s C h a r . e q u a l s ( s P a r t C h a r ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p u b l i c   b o o l e a n   S t a r t s W i t h ( H B W o r d   o P a r t )  
 	 {  
 	 	 i n t   i T h i s L e n   =   G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 i n t   i P a r t L e n   =   o P a r t . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 i f ( i T h i s L e n > = i P a r t L e n )  
 	 	 {  
 	 	 	 f o r ( i n t   i = 0 ;   i < i P a r t L e n ;   i + + )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s P a r t C h a r   =   o P a r t . G e t B a s e C h a r a c t e r A t ( i ) ;  
 	 	 	 	 S t r i n g   s T h i s C h a r   =   G e t B a s e C h a r a c t e r A t ( i ) ;  
 	 	 	 	  
 	 	 	 	 i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ A N Y ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s S i n h a l a C h a r a c t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e   i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ S W A R A ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s S w a r a L e t t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e   i f ( s P a r t C h a r . e q u a l s ( H B W _ C H A R _ G A T H R A K S H A R A ) )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( ! H e l a b a s a . I s H a l L e t t e r ( s T h i s C h a r . c h a r A t ( 0 ) ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 e l s e   i f ( ! s T h i s C h a r . e q u a l s ( s P a r t C h a r ) )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 r e t u r n   f a l s e ; 	 	  
 	 }  
 	  
 	 / * *  
 	   *   T h i s   w o r d   m u s t   b e   a   p a t t e r n  
 	   *   G i v e n   w o r d   m u s t   b e   a   n a t u r a l   w o r d  
 	   *   E x t r a c t s   t h e   v a r i a b l e   ( w i l d   c a r d   p a r t   o f   t h e   g i v e n   s t r i n g )  
 	   *   e . g      
 	   *   t h i s   =   * [ S , G ] x    
 	   *   o W o r d   =   A B C x  
 	   *   r e t u r n   =   A B C    
 	   *        
 	   *   @ p a r a m   o W o r d  
 	   *   @ r e t u r n  
 	   * /  
  
 	 p u b l i c   H B W o r d   E x t r a c t V a r i a b l e P a r t ( H B W o r d   o W o r d )  
 	 {  
 	 	 / / s u p p o r t s   * [ S , G ] x   t y p e   e x p r e s s i o n s 	 	  
 	 	 i n t   i P o s   =   0 ;  
 	 	 i n t   i L i m i t   =   0 ;  
 	 	  
 	 	 i f ( t h i s . G e t B a s e C h a r a c t e r C o u n t ( )   <   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) )  
 	 	 {  
 	 	 	 i L i m i t   =   t h i s . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 i L i m i t   =   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) ;  
 	 	 }  
 	 	  
 	 	 i f ( i L i m i t = = 0 )  
 	 	 {  
 	 	 	 r e t u r n   n e w   H B W o r d ( ) ;  
 	 	 }  
 	 	  
 	 	 w h i l e ( i P o s < i L i m i t )    
 	 	 { 	 	 	  
 	 	 	 S t r i n g   s C 1   =   t h i s . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	 / / S t r i n g   s C 2   =   o W o r d . G e t B a s e C h a r a c t e r F r o m E n d ( i P o s ) ;  
 	 	 	 	 	 	 	 	 	  
 	 	 	 i f ( s C 1 . e q u a l s ( H B W _ C H A R _ A N Y )   | |   s C 1 . e q u a l s ( H B W _ C H A R _ G A T H R A K S H A R A )   | |   s C 1 . e q u a l s ( H B W _ C H A R _ S W A R A ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o W o r d . S u b W o r d ( 0 ,   o W o r d . G e t B a s e C h a r a c t e r C o u n t ( ) - i P o s ) ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i P o s + + ;  
 	 	 } 	 	  
 	 	 r e t u r n   n e w   H B W o r d ( ) ;  
 	 } 	  
 	  
 	  
 	 / * *  
 	   *   T h i s   w o r d   m u s t   b e   a   p a t t e r n  
 	   *   G i v e n   w o r d   m u s t   b e   a   n a t u r a l   w o r d  
 	   *   E x t r a c t s   t h e   v a r i a b l e   ( w i l d   c a r d   p a r t   o f   t h e   g i v e n   s t r i n g )  
 	   *   e . g      
 	   *   t h i s   =   * x 	      
 	   *   r e t u r n   =   x  
 	   *        
 	   *   @ p a r a m   o W o r d  
 	   *   @ r e t u r n  
 	   * /  
  
 	 p u b l i c   H B W o r d   E x t r a c t F i x e d P a r t ( )  
 	 {  
 	 	 / / s u p p o r t s   * [ S , G ] x   t y p e   e x p r e s s i o n s 	 	  
 	 	 S t r i n g   s C 1   =   t h i s . G e t B a s e C h a r a c t e r A t ( 0 ) ; 	 	  
 	 	 	 	 	  
 	 	 i f ( s C 1 . e q u a l s ( H B W _ C H A R _ A N Y ) )  
 	 	 {  
 	 	 	 r e t u r n   S u b W o r d ( 1 ,   t h i s . G e t B a s e C h a r a c t e r C o u n t ( ) ) ;  
 	 	 } 	 	 	 	 	 	  
 	 	 	 	  
 	 	 r e t u r n   C l o n e ( ) ;  
 	 } 	 	  
  
 	 / * *  
 	   *   T h i s   w o r d   m u s t   b e   a   p a t t e r n  
 	   *   G i v e n   w o r d   m u s t   b e   a   n a t u r a l   w o r d   l e m m a  
 	   *   A p p e n d s   t h e   f i x e d   p a r t   f r o m   t h e   p a t t e r n   t o   t h e   n a t u r a l   s t r i n g  
 	   *   e . g      
 	   *   t h i s   =   * x    
 	   *   o W o r d   =   A B C  
 	   *   r e t u r n   =   A B C x    
 	   *        
 	   *   @ p a r a m   o L e m m a  
 	   *   @ r e t u r n  
 	   * /  
  
 	 p u b l i c   H B W o r d   A p p l y P a t t e r n ( H B W o r d   o L e m m a )  
 	 {  
 	 	 / / s u p p o r t s   * x   t y p e   e x p r e s s i o n s 	 	  
 	 	 H B W o r d   o F i x e d P a r t   =   t h i s . E x t r a c t F i x e d P a r t ( ) ;  
 	 	 H B W o r d   o R e t   =   o L e m m a . C l o n e ( ) ;  
 	 	 o R e t . A p p e n d ( o F i x e d P a r t ) ;  
 	 	 r e t u r n   o R e t ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   S e t F r e q u e n c y ( l o n g   l F r e q u e n c y )  
 	 {  
 	 	 l _ F r e q u e n c y   =   l F r e q u e n c y ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t F r e q u e n c y ( )  
 	 {  
 	 	 r e t u r n   l _ F r e q u e n c y ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   A n a l y z e ( S t r i n g   s V a l )  
 	 { 	 	  
 	 	 S y s t e m . o u t . p r i n t ( s V a l   +   "   =   " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < s V a l . l e n g t h ( ) ;   i + + )  
 	 	 { 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t (   s V a l . c h a r A t ( i )   +   "   [ 0 "   +   I n t e g e r . t o H e x S t r i n g ( s V a l . c h a r A t ( i ) )   +   " ] " ) ;  
 	 	 	 i f ( i = = ( s V a l . l e n g t h ( ) - 1 ) )  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t ( "   +   " ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   A n a l y z e W o r d ( S t r i n g   s W o r d )  
 	 {  
 	 	   H B W o r d   o W o r d   =   n e w   H B W o r d ( s W o r d ) ;  
 	 	   S y s t e m . o u t . p r i n t l n ( o W o r d . G e t N a t u r a l F o r m ( )   +   "   - >   "   +   o W o r d . G e t B a s e F o r m ( ) ) ; 	 	  
 	 	   H B W o r d   o W o r d 2   =   n e w   H B W o r d ( ) ;  
 	 	   o W o r d 2 . S e t B a s e F o r m ( o W o r d . G e t B a s e F o r m ( ) ) ;  
 	 	   S y s t e m . o u t . p r i n t l n ( o W o r d 2 . G e t B a s e F o r m ( )   +   "   < -   "   +   o W o r d 2 . G e t N a t u r a l F o r m ( ) ) ;  
 	 }  
 	  
 / / 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )  
 / / 	 { 	 	  
 / / 	 	   A n a l y z e W o r d ( "������ " ) ;  
 / / 	 	   A n a l y z e W o r d ( "������ " ) ;  
 / / 	 	   A n a l y z e W o r d ( "������ " ) ;  
 / / 	 	   A n a l y z e W o r d ( "����  ����� " ) ;  
 / / 	 	   A n a l y z e W o r d ( "�� ������ " ) ;  
 / / 	 	   A n a l y z e W o r d ( "�� ��  ����� " ) ;  
 / / 	 	    
 / / 	 	  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	  
 / / 	 	 A n a l y z e ( "�� � " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� " ) ;  
 / / / / 	 	 A n a l y z e ( "��� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	  
 / / 	 	 A n a l y z e ( "�� � " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ;  
 / / / / 	 	 A n a l y z e ( "�� �� " ) ; 	  
 / / 	 	  
 / / 	 	  
 / / 	 }  
 }  
