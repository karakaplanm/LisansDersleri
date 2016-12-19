// Windowsapi ile pencere ve buton oluşturma
//Derlemek için: gcc hello.c -o hello.exe

#include <windows.h>

int APIENTRY WinMain(HINSTANCE hInstance,HINSTANCE hPrevInstance,LPSTR lpCmdLine, int nCmdShow)
{
    MessageBox(NULL,"Bu bir Penceredir","Hello World", MB_OK);
    return 0;
}
