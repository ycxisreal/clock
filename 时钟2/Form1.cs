namespace 时钟2
{
    public partial class Form1 : Form
    {
        public bool exit=false;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            exit=true;
            change_time();
            Close();
        }

        private void textBox1_Enter(object sender, EventArgs e)
        {

        }
        public void change_time()
        {
            if(exit)
            {
                return;
            }
            while(!exit)
            {
                Thread.Sleep(1000);
                textBox1.Text = DateTime.Now.ToString();
            }

        }
        private void Form1_Load(object sender, EventArgs e)
        {

            ThreadStart child = new ThreadStart(change_time);
            Thread a = new Thread(child);
            a.Start();
        }
    }
}