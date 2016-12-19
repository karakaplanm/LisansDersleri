#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_topla_released()
{
    int a,b,c;
    a=ui->lineEdit_s1->text().toInt();
    b=ui->lineEdit_s2->text().toInt();
    c=a+b;
    QString sonuc= QString::number(c);
    ui->lineEdit_s3->setText(sonuc);
}

void MainWindow::on_pushButton_cik_released()
{
    this->close();
}
