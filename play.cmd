@echo off
if "%JAVA_HOME%"=="" (
    echo.
    echo Favor definir variavel de ambiente JAVA_HOME
    echo.
    exit /b
)
set projeto=%cd%
cd %projeto%
set "JAVA_OPTS=-Xms128m -Xmx1024m"
set "JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8"
:inicio
cls
echo.
echo HOJE [ %date% ]
echo LOCAL DO PROJETO [ %CD% ]
echo JAVA_HOME [ %JAVA_HOME% ]
echo.
echo 1. Iniciar Console
echo 2. Publicar
echo.
echo 3. Sair
echo.
set /p choice=Selecione a opcao desejada:
if '%choice%'=='' echo "%choice%" opcao invalida !!
if '%choice%'=='1' goto opcao1
if '%choice%'=='2' goto opcao2
if '%choice%'=='3' goto opcao3
echo.
goto inicio
:opcao1
echo ------------------------------------------------------
echo ------- Iniciando terminal do Play -------------------
echo ------------------------------------------------------
sbt -Duser.timezone=GMT-3
exit
:opcao2
del /s /q "target\*.*"
for /d %%p in ("target\*.*") do rmdir "%%p" /s /q
echo ------- Exec. publishLocal -------------------
sbt clean compile publishLocal
:opcao3
exit /b 0