//������������ ���� ���������������� � ��������� � Bit++.
//���� ���� ����� ��������� � �������!
//����������� ����� Bit++ ������� � ���, ��� � ��� ����� ����
//����������, ������� ���������� x. ����� � ���� ����� ���� ��� ��������:
//�������� ++ ����������� ��������, ���������� � ���������� x �� 1.
//�������� -- ��������� ��������, ���������� � ���������� x �� 1.
//����������� � ����� Bit++ � ��� ������������������, ��������� ��
//����� ����� �������� � ����� ����� ���������� x. �����������
//������������ ��� ��������, �� ���� ����� ��������� ������ �������:
//�+�, �-�, �X�. ��������� �����������, ������ ��������� ��������,
//������� ���������� � �����������.
//��������� �� ����� Bit++ � ��� ������������������ �����������, ������
//�� ������� ��������� ���������. ��������� ���������, ������ ���������
//��� �� �����������.
//��� ������ ��������� �� ����� Bit++. ����� ����������� ��������� �
//���������� x �������� �������� 0. ��������� ��������� � �������� ��������,
//������� ����� ��������� � ���������� x ����� ���������� ���������.
//������� ������:
//� ������ ������ �������� ������������ ����� ����� n (1?n?150) � ����������
//����������� � ���������. � ������ �� ��������� n ����� �������� ��
//�����������. ������ ����������� ������� �� ����� ����� ��������
//(++ ��� --) � ����� ����� ���������� x (������������ ������ �X�).
//����� �������, �� ������ ������ �����������. �������� � ����������
//����� ���� �������� � ����� �������.
//�������� ������:
//�������� ������������ ����� ����� � ��������, ������� ����� ���������
//� ���������� x ����� ���������� ���������.
fun main() {
    var x = 0
    val n = readLine()!!.toInt()
    var stroka: String
    repeat(n) {
        stroka = readLine()!!
        if (stroka.contains("+")) x++
        else if (stroka.contains("-")) x--
    }
    print(x)
}