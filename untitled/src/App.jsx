import './index.css'

function App() {

  return (
    <>
        <div className='search-div'>
            <input type={'text'} className="search-input" placeholder={'Search...'}/>
            <button type={'submit'} ><i className='bx bx-search'></i></button>
        </div>

        <main>
            <button className="add-btn">Add</button>
            <section className="student-list">
                <ol>
                    <li>
                        Jibran Baraka
                    </li>
                    <li>
                        Jibran Baraka
                    </li>
                </ol>
            </section>
        </main>

    </>
  )
}

export default App
