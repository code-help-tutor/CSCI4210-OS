WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/* annoying.c */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
  while ( 1 )
  {
    printf( "Hey, get back to work!\n" );
    sleep( 3 );
  }

  return EXIT_SUCCESS;
}
