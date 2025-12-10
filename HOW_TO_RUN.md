# How to Run the StaticWebProjDemo Project

## Project Overview
This is a **Static Web Project** built for Eclipse IDE. It contains multiple HTML pages with CSS and JavaScript, designed to run in a web browser.

## Project Structure
```
JFS_VISEM/
├── public/              # Main web content directory
│   ├── test.html        # LifeCanvas - Personal Productivity Dashboard
│   ├── course_registration.html
│   ├── Photo_Details/
│   │   └── index.html
│   ├── SUB2_TIMETABLE/
│   │   └── show_pat_tt.html
│   ├── SU_2/
│   │   └── course_registration.html
│   └── js/
│       ├── myjs.js
│       └── script.js
├── .project             # Eclipse project configuration
└── README.md
```

## Running the Project

### Method 1: Direct Browser Access (Simplest)
1. Navigate to the `public` folder: `c:\Users\Admin\JAVA_VISEM\JFS_VISEM\public`
2. Double-click any HTML file to open it in your default browser:
   - **test.html** - LifeCanvas Personal Productivity Dashboard (single-file app)
   - **course_registration.html** - Course Registration page
   - **Photo_Details/index.html** - Photo Details page
   - **SUB2_TIMETABLE/show_pat_tt.html** - Timetable page
   - **SU_2/course_registration.html** - Alternative Course Registration

### Method 2: Using a Local Web Server (Recommended)

#### Option A: Using Python (if installed)
```powershell
# Navigate to the public directory
cd c:\Users\Admin\JAVA_VISEM\JFS_VISEM\public

# Python 3.x
python -m http.server 8000

# OR Python 2.x
python -m SimpleHTTPServer 8000
```
Then open your browser and go to: `http://localhost:8000`

#### Option B: Using Node.js (if installed)
```powershell
# Install http-server globally (one-time)
npm install -g http-server

# Navigate to the public directory
cd c:\Users\Admin\JAVA_VISEM\JFS_VISEM\public

# Start the server
http-server -p 8000
```
Then open your browser and go to: `http://localhost:8000`

#### Option C: Using Live Server (VS Code Extension)
1. Open the project in VS Code
2. Install the "Live Server" extension by Ritwick Dey
3. Right-click on any HTML file
4. Select "Open with Live Server"

### Method 3: Using Eclipse IDE
1. **Import the Project** (if not already imported):
   - Open Eclipse
   - File → Import → General → Existing Projects into Workspace
   - Browse to: `c:\Users\Admin\JAVA_VISEM\JFS_VISEM`
   - Click Finish

2. **Run the Project**:
   - Right-click on any HTML file in the Project Explorer
   - Select "Open With" → "Web Browser"
   - OR
   - Right-click on the project → Run As → Run on Server (if you have a server configured)

### Method 4: Using PowerShell with Start Command
```powershell
# Open a specific HTML file in your default browser
Start-Process "c:\Users\Admin\JAVA_VISEM\JFS_VISEM\public\test.html"
```

## Available Pages

### 1. LifeCanvas (test.html)
**Features:**
- Personal productivity dashboard
- Task management (add, edit, delete, mark complete)
- Drag and drop to reorder tasks
- Dark/Light theme toggle
- Search and sort functionality
- Progress tracking with visual ring
- Export tasks to JSON
- LocalStorage persistence
- Motivational quotes

**How to use:**
- Add tasks using the input field
- Click checkbox to mark tasks complete
- Drag tasks to reorder
- Use the moon icon to toggle dark mode
- Search tasks using the search bar
- Export your tasks as JSON

### 2. Course Registration Pages
- Located at `course_registration.html` and `SU_2/course_registration.html`

### 3. Photo Details
- Located at `Photo_Details/index.html`

### 4. Timetable
- Located at `SUB2_TIMETABLE/show_pat_tt.html`

## Troubleshooting

### Issue: Files not loading properly
- **Solution**: Use a local web server (Method 2) instead of opening files directly
- Some features may require HTTP protocol to work correctly

### Issue: JavaScript not working
- **Solution**: Check browser console (F12) for errors
- Ensure JavaScript is enabled in your browser

### Issue: Styles not loading
- **Solution**: Check that CSS files are in the correct location
- For `test.html`, all styles are embedded in the file itself

### Issue: CORS errors
- **Solution**: Use a local web server instead of file:// protocol

## Quick Start Commands

```powershell
# Navigate to project
cd c:\Users\Admin\JAVA_VISEM\JFS_VISEM\public

# Quick open in browser (Windows)
Start-Process test.html

# Start Python server
python -m http.server 8000

# Start Node.js server (if http-server is installed)
http-server -p 8000
```

## Browser Compatibility
- Chrome (recommended)
- Firefox
- Edge
- Safari
- Opera

All modern browsers are supported. For best experience, use the latest version.

## Notes
- This is a **static web project** - no backend server required
- All data in LifeCanvas (test.html) is stored in browser's LocalStorage
- The project uses vanilla HTML, CSS, and JavaScript (no build step required)
- No dependencies need to be installed

## Development
To modify the project:
1. Edit HTML, CSS, or JavaScript files directly
2. Refresh the browser to see changes
3. For `test.html`, all code is in a single file for easy deployment

---

**Last Updated:** December 2025
